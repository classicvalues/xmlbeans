/*   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.xmlbeans;

/**
 * Corresponds to the XML Schema
 * <a target="_blank" href="http://www.w3.org/TR/xmlschema-2/#normalizedString">xs:normalizedString</a> type.
 * One of the derived types based on <a target="_blank" href="http://www.w3.org/TR/xmlschema-2/#string">xs:string</a>.
 * <p>
 * An normalizedString simply is a string where all the carriage return,
 * linefeed, and tab characters have been normalized (switched to) ordinary
 * space characters.  Use normalizedString for long strings to make them
 * insensitive to line breaking.  If you wish to often be insensitive to
 * runs of whitespace (as is often the case), use
 * <a target="_blank" href="http://www.w3.org/TR/xmlschema-2/#token">xs:token</a>
 * (aka {@link XmlToken}) instead.
 * <p>
 * Convertible to {@link String}.  When obtaining the stringValue, the
 * whitespace-normalized value is returned.
 */
public interface XmlNormalizedString extends XmlString {
    /**
     * The constant {@link SchemaType} object representing this schema type.
     */
    SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_normalizedString");

    /**
     * A class with methods for creating instances
     * of {@link XmlNormalizedString}.
     */
    final class Factory {
        /**
         * Creates an empty instance of {@link XmlNormalizedString}
         */
        public static XmlNormalizedString newInstance() {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().newInstance(type, null);
        }

        /**
         * Creates an empty instance of {@link XmlNormalizedString}
         */
        public static XmlNormalizedString newInstance(org.apache.xmlbeans.XmlOptions options) {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().newInstance(type, options);
        }

        /**
         * Creates an immutable {@link XmlNormalizedString} value
         */
        public static XmlNormalizedString newValue(Object obj) {
            return (XmlNormalizedString) type.newValue(obj);
        }

        /**
         * Parses a {@link XmlNormalizedString} fragment from a String. For example: "<code>&lt;xml-fragment&gt; string to normalize &lt;/xml-fragment&gt;</code>".
         */
        public static XmlNormalizedString parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().parse(s, type, null);
        }

        /**
         * Parses a {@link XmlNormalizedString} fragment from a String. For example: "<code>&lt;xml-fragment&gt; string to normalize &lt;/xml-fragment&gt;</code>".
         */
        public static XmlNormalizedString parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().parse(s, type, options);
        }

        /**
         * Parses a {@link XmlNormalizedString} fragment from a File.
         */
        public static XmlNormalizedString parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().parse(f, type, null);
        }

        /**
         * Parses a {@link XmlNormalizedString} fragment from a File.
         */
        public static XmlNormalizedString parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().parse(f, type, options);
        }

        /**
         * Parses a {@link XmlNormalizedString} fragment from a URL.
         */
        public static XmlNormalizedString parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().parse(u, type, null);
        }

        /**
         * Parses a {@link XmlNormalizedString} fragment from a URL.
         */
        public static XmlNormalizedString parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().parse(u, type, options);
        }

        /**
         * Parses a {@link XmlNormalizedString} fragment from an InputStream.
         */
        public static XmlNormalizedString parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().parse(is, type, null);
        }

        /**
         * Parses a {@link XmlNormalizedString} fragment from an InputStream.
         */
        public static XmlNormalizedString parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().parse(is, type, options);
        }

        /**
         * Parses a {@link XmlNormalizedString} fragment from a Reader.
         */
        public static XmlNormalizedString parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().parse(r, type, null);
        }

        /**
         * Parses a {@link XmlNormalizedString} fragment from a Reader.
         */
        public static XmlNormalizedString parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().parse(r, type, options);
        }

        /**
         * Parses a {@link XmlNormalizedString} fragment from a DOM Node.
         */
        public static XmlNormalizedString parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().parse(node, type, null);
        }

        /**
         * Parses a {@link XmlNormalizedString} fragment from a DOM Node.
         */
        public static XmlNormalizedString parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().parse(node, type, options);
        }

        /**
         * Parses a {@link XmlNormalizedString} fragment from an XMLStreamReader.
         */
        public static XmlNormalizedString parse(javax.xml.stream.XMLStreamReader xsr) throws org.apache.xmlbeans.XmlException {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().parse(xsr, type, null);
        }

        /**
         * Parses a {@link XmlNormalizedString} fragment from an XMLStreamReader.
         */
        public static XmlNormalizedString parse(javax.xml.stream.XMLStreamReader xsr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
            return (XmlNormalizedString) XmlBeans.getContextTypeLoader().parse(xsr, type, options);
        }

        private Factory() {
            // No instance of this class allowed
        }
    }
}

