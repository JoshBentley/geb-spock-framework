/**
 * @author Josh Bentley
 */
package com.jb.tests

import com.jb.ui.pages.GooglePage
import geb.spock.GebReportingSpec
import org.openqa.selenium.Keys

class googleSearchSpec extends GebReportingSpec {

    def setup() {
        to GooglePage
        at GooglePage
    }

    def "search for pictures of doggos"() {

        when: "you input 'doggo pics' into the search bar"
        searchBar << "doggo pics" + Keys.ENTER
        then: "verify search"
        title.contains("doggo pics")

    }

    /*
    Example of a failing test
     */
    def "search for pictures of cats"() {

        when: "you input 'cat pics' into the search bar"
        searchBar << "cat pics" + Keys.ENTER
        then: "verify search"
        title.contains("doggo pics")

    }
}
