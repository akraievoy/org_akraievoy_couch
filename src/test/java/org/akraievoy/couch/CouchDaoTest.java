package org.akraievoy.couch;

import com.google.common.io.InputSupplier;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Simple test harness, I don't currently need any kind of
 * unit-testing here.
 * <p/>
 * Also this is a simplest usecase showing what this
 * library is all about.
 */
public class CouchDaoTest {
    public static void main(String[] args) {
        final CouchSetupBean couchSetup = new CouchSetupBean();
        couchSetup.setCouchDbUrl("http://127.0.0.1:5984/");
        couchSetup.setCouchDbUser("supercow");
        couchSetup.setCouchDbPassword("******");

        final CouchDao couchDao = new CouchDao(couchSetup);
        couchDao.setDbName("elw-user");
        couchDao.start();

        final SquabTest squab = new SquabTest();
        final CouchDao.UpdateStatus updateStatus =
                couchDao.createOrUpdate(squab);

        squab.setCouchRev(updateStatus.rev);
        final String couchRev2 = couchDao.attachStream(
                squab, "stream", "text/plain",
                new InputSupplier<InputStream>() {
                    public InputStream getInput() throws IOException {
                        return new ByteArrayInputStream(
                                "this is a simple test here".getBytes()
                        );
                    }
                }
        );

        squab.setCouchRev(couchRev2);
        final String couchRev3 = couchDao.attachStream(
                squab, "anotherStream", "text/plain",
                new InputSupplier<InputStream>() {
                    public InputStream getInput() throws IOException {
                        return new ByteArrayInputStream(
                                "this is an extra test here".getBytes()
                        );
                    }
                }
        );

        System.out.println("couchRev3 = " + couchRev3);

        //  LATER show off supercool id range/filter queries
    }

    public static class SquabTest extends Squab {
        private final String salt =
                Long.toString(System.currentTimeMillis(), 36);

        @Override
        protected String[] pathElems() {
            return new String[]{salt};
        }
    }
}
