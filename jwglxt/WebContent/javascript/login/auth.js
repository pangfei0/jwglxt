/**
 * $Id: auth.js,v 1.1 2015/07/16 10:37:39 register Exp $
 * Copyright �2005 Sun Microsystems, Inc.  All rights reserved.
 *
 * Sun Microsystems, Inc. has intellectual property rights relating to
 * technology embodied in the product that is described in this document.
 * In particular, and without limitation, these intellectual property rights
 * may include one or more of the U.S. patents listed at
 * http://www.sun.com/patents and one or more additional patents or pending
 * patent applications in the U.S. and in other countries.
 *
 * U.S. Government Rights - Commercial software.  Government users are subject
 * to the Sun Microsystems, Inc. standard license agreement and applicable
 * provisions of the FAR and its supplements.
 *
 * Use is subject to license terms.
 *
 * This distribution may include materials developed by third parties.Sun,
 * Sun Microsystems and  the Sun logo are trademarks or registered trademarks
 * of Sun Microsystems, Inc. in the U.S. and other countries.  
 *
 * Copyright �2005 Sun Microsystems, Inc. Tous droits r閟erv閟.
 * Sun Microsystems, Inc. d閠ient les droits de propri閠�intellectuels relatifs
 * �la technologie incorpor閑 dans le produit qui est d閏rit dans ce document.
 * En particulier, et ce sans limitation, ces droits de propri閠� * intellectuelle peuvent inclure un ou plus des brevets am閞icains list閟
 * �l'adresse http://www.sun.com/patents et un ou les brevets suppl閙entaires
 * ou les applications de brevet en attente aux Etats - Unis et dans les
 * autres pays.
 *
 * L'utilisation est soumise aux termes du contrat de licence.
 *
 * Cette distribution peut comprendre des composants d関elopp閟 par des
 * tierces parties.
 *
 * Sun,  Sun Microsystems et  le logo Sun sont des marques de fabrique ou des
 * marques d閜os閑s de Sun Microsystems, Inc. aux Etats-Unis et dans
 * d'autres pays.
 */



/** makes current page occupies entire browser window */
function occupyFullBrowser() {
    if (top.location != window.location) {
	top.location = window.location;
    }
}

/** places cursor on the first form element */
function placeCursorOnFirstElm() {
    var frms = document.forms;
    var frmCount = frms.length;

    for (var i = 0; i < frmCount; i++) {
	var frm = frms[i];
	var sz = frm.elements.length;

	for (var j = 0; j < sz; j++) {
	    var elm = frm.elements[j];

	    if (elm.type != "hidden") {
		elm.focus();
		return;
	    }
	}
    }
}

/** 
 * writes the corresponding css based on browser type 
 *
 * @param serviceUri
 *

function writeCSS(serviceUri) {
    document.write("<link href='" + serviceUri);

    if (is_ie6up) {
        // IE 6.x or above.
        document.write("/css/css_ie6up.css");
    } else if (is_ie5up) {
        // IE 5.x or above.
        document.write("/css/css_ie5win.css");
    } else if (is_gecko) {
        // Netscape 6/7, Mozilla
        document.write("/css/css_ns6up.css");
    } else if (is_nav4 && is_win) {
        // Netscape 4 Windows.
        document.write("/css/css_ns4win.css");
    } else if (is_nav4) {
        // Netscape 4 Solaris & Linux.
        document.write("/css/css_ns4sol.css");
    } else {
        // All others
        document.write("/css/css_ns6up.css");
    }

    document.write("' type='text/css' rel='stylesheet' />");
}
 */
/**
 * marks button
 *
 * @param label of button
 * @param href of button
 */
function markupButton(label, href) {
    label = "&nbsp;" + strTrim(label) + "&nbsp;";
    document.write("<td>");
    document.write("<div class=\"logBtn\">");    
    document.write("<input name=\"Login.Submit\" type=\"button\"");
    document.write(" class=\"Btn1Def\" value=\"");
    document.write(label);
    document.write("\" onclick=\"");
    document.write(href);
    document.write("\" onmouseover=\"javascript: if (this.disabled==0) this.className='Btn1DefHov'\"");
    document.write(" onmouseout=\"javascript: if (this.disabled==0) this.className='Btn1Def'\"");
    document.write(" onblur=\"javascript: if (this.disabled==0) this.className='Btn1Def'\"");
    document.write(" onfocus=\"javascript: if (this.disabled==0) this.className='Btn1DefHov'\"");    
    document.write("/></div></td>");
}

/**
 * aggregrates all the form elements in different forms into
 * a hidden form
 */
function aggSubmit() {
    var frms = document.forms;
    var hiddenFrm = frms['Login'];

    if (hiddenFrm != null) {
	for (var i = 0; i < elmCount; i++) {
	    var frm = frms['frm' + i];

	    if (frm != null) {
		var elm = frm.elements[0];

		if (elm != null) {
		    if (elm.type == 'radio') {
			hiddenFrm.elements[i].value =
			    getSelectedRadioValue(frm);
		    } else if (elm.type == 'checkbox') {
			hiddenFrm.elements[i].value = 
                            getSelectedCheckBoxValues(frm);
		    } else {
			hiddenFrm.elements[i].value = elm.value;
		    }
		}
	    }
	}
    }
}

/**
 * gets selected radio value
 *
 * @param frmObj - form object
 */
function getSelectedRadioValue(frmObj) {
    for (var i = 0; i < frmObj.elements.length; i++) {
	var elm = frmObj.elements[i];

	if (elm.checked) {
	    return elm.value;
	}
    }
    return "";
}

/**
 * gets selected check box values separated by "|"
 *
 * @param frmObj - form object
 */
function getSelectedCheckBoxValues(frmObj) {
    var checked = "";
    for (var i = 0; i < frmObj.elements.length; i++) {
	var elm = frmObj.elements[i];

        if ((elm.checked) && (elm.type == 'checkbox')) {
            checked = checked + elm.value + "|";
        }
    }
    return checked;
}

/**
 * trims leading and trailing spaces of a string
 *
 * @param str - string to trim
 * @return trimmed string
 */
function strTrim(str){
    return str.replace(/^\s+/,'').replace(/\s+$/,'')
}

/**
 * clears all form elements
 *
 * @param frm - form obj
 */
function clearFormElms(frm) {
    if (frm != null) {
	var elms = frm.elements;

	if ((elms != null) && (elms.length > 0)) {
	    for (var i = 0; i < elms.length; i++) {
		var elm = elms[i];
		elm.value = "";
	    }
	}
    }
}
