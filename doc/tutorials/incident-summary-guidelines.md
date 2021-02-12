# SecureX Incident Summary Guidelines

In order to achieve visual and functional uniformity in the SecureX Incident Manager, and to provide a consistent and high quality user experience, we've produced these format and content guidelines for incident summaries in SecureX. The aim is to help document incident description requirements for content developers and integration partners both within Cisco, and with third party products.

## Incident Summary Format Overview

SecureX Threat Response renders incident summaries containing up to 5000 characters of Markdown text. This data is stored in the `description` field of the incident entity.

Unlike GitHub Markdown, SecureX Threat Response uses a limited subset of Markdown, with no support for images or tabular data.

This document details the format and content guidelines for Incident summaries.

## Markdown

**Supported Markdown**

  - Headers
  - Subheaders
  - Paragraphs
  - Hyperlinks
  - Lists
    - Ordered
    - Unordered
    - Nested
  - Strong text
  - Emphasis text
  - Preformatted text
    - inline
    - block
  - Quoted text

**Unsupported Markdown**

  - Images
  - Tabular data

## Markdown Formatting Requirements

1. Begin your incident summary markdown with a terse H1 header. Only use the H1 header once per incident summary, at the top of the summary, like so:
    ````
    # Incident Header
    ````
2. Use H2 headers for subheaders within the summary, like so:
    ````
    ## Subheader
    ````
3. Use H3 headers for secondary subheaders:
    ````
    ### Secondary subheader
    ````
4. Limit or avoid the use of H4-H6 subheaders. Instead, use `**Strong Text**` followed by a newline for titles between paragraphs and sections lower than H3.
6. Separate paragraphs within the summary by an empty line, using the newline character.
7. Tabular data is not supported, do not attempt to include it.
8. Do not attempt to include raw HTML, as it is also not supported, and will not render correctly. This includes custom CSS.
9. Keep your pre-formatted text blocks to a width of 80 characters or fewer, to prevent the need for users to scroll horizontally, whenever possible.
10. You must explicitly encode newline / carriage return characters using `\n` within your `description` strings.
    for example, the string `"This is a paragraph\n\nThis is a second paragraph"` will yield the following Markdown:
    ```
    This is a paragraph

    This is a second paragraph
    ```

### Markdown Formatting Example

````
```
# Possible Port Knocking Detected on 02-09-11
At 4:12am on February 9th, NIDS alerted for suspected port knocking behavior on VLAN 204. This behavior continued for 20 minutes, and then abruptly stopped.

## Investigation Details

Investigation details go here. (Note the H2, because this is a subsection in the document)

## Initial Response and Mitigation

(Also an H2, as we move on to the next subsection of the summary)

Unlike in GitHub markdown, Headers do NOT automatically have named anchor tags associated with them, so you cannot use them to create tables of contents like in GitHub markdown.  This [Header2 link](#Header2) link doesn't actually work, like it would in GitHub.

There's currently no other way to link in between parts of the markdown document.

### Emphasis and Strong text

Paragraph with *emphasis*, a [link](url) and `preformatted text`

**Strong for non-header section titles**

## Impact Assessment

**Tabular Data**
Markdown tabular data is NOT currently supported.  Neither of the following methods will produce data tables in the Threat Response GUI:

This won't work:
```
| data | table | with | columns |
| 0 | 1 | 2 | 3 |
```

Neither will this (or any other raw HTML):
```
<table>
  <tr><td>0</td><td>1</td></tr>
  <tr><td>2</td><td>3</td></tr>
</table>
```

## Remediation and Root Cause Analysis

**Preformatted Text Blocks**

```
Preformatted text blocks are typically used for showing code, email headers, or
command line tool output that spans multiple lines.  You specify preformatted
text blocks using three backticks, as shown here.

For purposes of readability and ease of use, and visually clean, please limit
your preformatted text blocks to 80 characters wide, if at all possible.

Doing so will prevent users from needing to scroll horizontally in order to read
the preformatted text contents.
```

**Lists**

1. First list element
2. Second list element
3. Third list element with \`inline preformatted text\`
    List elements cannot contain multiple paragraphs, as soft breaks are not supported and do not currently indent.
    - However, you can use bullet points nested within an ordered list.
4. Ordered lists can start from any number. This is the fourth item in this list.
5. Nested list support
    - one
    - another
    - yet another
6. Nested sublists do introduce whitespace above the next parent list item.
7. Multiple levels of nesting are permitted.
    - unordered list within ordered list.
        1. Ordered list within unordered list
        2. Second nested ordered element
    - second unordered element

**Quoted Text**

> Quoted text is useful when quoting from user interface text, email contents, or any other data that is not fixed width CLI output or source code.  Quotes can also include [links](#) and `inline preformatted text`.
> When you add a newline to a quote block, you have to preface with an additional `> ` quoted text indicator.
```
````

## Markdown Content Requirements

1. Provide the following subsections for incident summaries:
  - Incident Overview
  - Investigation Details
  - Initial Response and Mitigation
  - Impact Assessment
  - Remediation and Root Cause Analysis

### Markdown Content Template

```
"# Incident Summary Title\n\n## Incident Overview\n\n##Investigation Details\n\n##Initial Response and Mitigation\n\n##Impact Assessment\n\n##Remediation and Root Cause Analysis"
```

Should yield the following template:

```
# Incident Summary Title

## Incident Overview

## Investigation Details

## Initial Response and Mitigation

## Impact Assessment

## Remediation and Root Cause Analysis
```
