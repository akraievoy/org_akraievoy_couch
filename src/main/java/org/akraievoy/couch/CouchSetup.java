package org.akraievoy.couch;

import java.util.Map;

/**
 * Callback providing CouchDB URL user/password values in runtime.
 * <p/>
 * This is better than property injection as your
 * implementation may be dynamic and shared across multiple
 * CouchDao instances.
 */
public interface CouchSetup {
    String getCouchDbUrl();

    String getCouchDbUser();

    String getCouchDbPassword();

    /**
     * May provide an override for db name
     * being set within CouchDao (maps from latter to former)
     *
     * @return not null, may be empty
     */
    Map<String, String> getCouchDbNames();
}
