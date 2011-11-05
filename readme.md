# Intro

Package: org.akraievoy:couch
Copyright/Maintenance 2011 Anton Kraievoy akraievoy@gmail.com

## Description

Ultralight and super-simpliistic CouchDB client library. 

Dependencies: 
 * jackson-core / jackson-mapper --- required, period
 * google guava --- in-memory caching relies on that, may be removed with small loss of featureset
 * google guava (oops, ahem) --- some streaming was also done with Guava, rewritable with bare J2SE, if needed
 * slf4j, findbugs:jsr305 --- easily removable, but most typically you should have chosen them already ;)

### Boring stuff

Sample of license header:

    /*
        This file is part of org.akraievoy:couch.
 
        org.akraievoy:couch is free software: you can redistribute it and/or modify
        it under the terms of the GNU Lesser General Public License as published by
        the Free Software Foundation, either version 3 of the License, or
        (at your option) any later version.

        org.akraievoy:couch is distributed in the hope that it will be useful,
        but WITHOUT ANY WARRANTY; without even the implied warranty of
        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        GNU Lesser General Public License for more details.

        You should have received a copy of the GNU Lesser General Public License
        along with org.akraievoy:couch. If not, see <http://www.gnu.org/licenses/>.
     */

Sample of copyright header.

    /*
        Copyright ${year} ${author} ${email}
     */
