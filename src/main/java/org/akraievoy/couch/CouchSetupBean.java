package org.akraievoy.couch;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Simple bean-based implementation of CouchSetup
 */
public class CouchSetupBean implements CouchSetup {
    private String couchDbUrl;
    private String couchDbUser;
    private String couchDbPassword;

    private final SortedMap<String, String> couchDbNames =
        new TreeMap<String, String>();

    public String getCouchDbPassword() {
        return couchDbPassword;
    }

    public void setCouchDbPassword(final String couchDbPassword) {
        this.couchDbPassword = couchDbPassword;
    }

    public String getCouchDbUrl() {
        return couchDbUrl;
    }

    public void setCouchDbUrl(final String couchDbUrl) {
        this.couchDbUrl = couchDbUrl;
    }

    public String getCouchDbUser() {
        return couchDbUser;
    }

    public void setCouchDbUser(final String couchDbUser) {
        this.couchDbUser = couchDbUser;
    }

    public SortedMap<String, String> getCouchDbNames() {
        return Collections.unmodifiableSortedMap(couchDbNames);
    }

    public void setCouchDbNames(final SortedMap<String, String> couchDbNames) {
        this.couchDbNames.clear();
        if (couchDbNames != null) {
            this.couchDbNames.putAll(couchDbNames);
        }
    }
}
