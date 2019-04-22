/**
 * @author Josh Bentley
 */
package com.jb.ui.pages

import geb.Page

class GooglePage extends Page {

    static url = "/"

    static at = {
        title.equals("Google")
    }

    static content = {
        searchBar { $("input", title: "Search") }
    }
}
