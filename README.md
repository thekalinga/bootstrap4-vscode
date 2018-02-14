Bootstrap 4 & Font awesome snippets for Visual studio code
===========================

Visual studio code plugin containing Bootstrap 4, Font awesome 4 & Font Awesome 5 Free & Pro snippets. This plugin works in both in the stable & the insiders build

![Plugin in action](help.gif)

Feel free to let me know what else you want added via the [issues](https://github.com/thekalinga/bootstrap4-vscode/issues)

Suggestions, feedback and other comments welcome via [@thekalinga](https://twitter.com/thekalinga) on Twitter.

## Setup (in 2 easy steps)

1. Install plugin
  1. Press `F1`, paste `ext install bootstrap4-vscode` & then press `enter` (or)
  2. Goto extensions by pressing `Ctrl-Shift-X` (Windows/Linux) or `Cmd-Shift-X` (Mac) & Search for `Bootstrap 4 & Font awesome`, click on install
2. Reload your editor

You are good to go

## Usage

To use the bootstrap snippets, open a HTML file, and start typing `b4-`, followed by pressing `Ctrl+Space`. A list of bootstrap snippets will show up

To use font awesome 4 snippets, open a HTML file, and start typing `fa4-`, the editor will show you all the snippets

To use font awesome 5 free snippets, open a HTML file, and start typing `fa5-`, the editor will show you all the snippets

To use font awesome 5 pro snippets, open a HTML file, and start typing `fa5p-`, the editor will show you all the snippets

The detailed list of supported actions are listed below under documentation section

## Contribution guidelines

1. Clone this repo
2. To modify bootstrap snippets, you can find the templates for each snippet under `src/util/resources/bootstrap`. These Html snippets must follow [sublime text snippet](http://docs.sublimetext.info/en/latest/extensibility/snippets.html) format. There is no need to update `snippets.json` manually. The build will take care of regenerating this file from template files.
3. If you need to change `README.md` (or) `package.json`, you should modify their templates (which are used to generate the root level files) under `src/util/resources`. For eg., If you want `package.json` at the root to be modified, you should change `package-template.json` under `src/util/resources`. These root level `package.json` & `README.md` are regenerated for every build from their corresponding templates.
4. To modify font awesome snippets, you would need to modify `font-awesome.json` under `src/util/resources`
5. Send me a pull request

## Changelog

See [here](CHANGELOG.md)

## Documentation

### Bootstrap master template

Trigger | Description
--- | ---
$ | Bootstrap master template

### Alert

Trigger | Description
--- | ---
alert-additional-content | Alert additional content
alert-closable | Alert closable
alert-default | Alert default
alert-dismissible | Alert dismissible
alert-link | Alert link

### Badge

Trigger | Description
--- | ---
badge-button | Badge button
badge-default | Badge default
badge-heading | Badge heading
badge-link | Badge link
badge-pill | Badge pill

### Button group

Trigger | Description
--- | ---
bgroup-default | Button group default
bgroup-dropdown-vertical | Button group dropdown vertical
bgroup-dropdown | Button group dropdown
bgroup-size | Button group size
bgroup-toolbar | Button group toolbar

### Breadcrumb

Trigger | Description
--- | ---
breadcrumb-default | Breadcrumb default
breadcrumb-list | Breadcrumb list

### Button

Trigger | Description
--- | ---
button-a | Button with link
button-block | Button block
button-checkbox | Button checkbox
button-default | Button default
button-disabled-a | Button disabled with link
button-input | Button input
button-outline | Button outline
button-radio | Button radio
button-sizes | Button sizes
button-toggle | Button toggle

### Card

Trigger | Description
--- | ---
card-align | Card align
card-background-custom | Card background custom
card-background | Card background
card-blockquote | Card blockquote
card-border | Card border
card-columns | Card columns
card-decks | Card decks
card-default | Card default
card-grid | Card grid
card-groups | Card groups
card-head-foot | Card head foot
card-links | Card links
card-list | Card list
card-overlay | Card overlay
card-pill-head | Card pill head
card-subtitle | Card subtitle
card-tab-head | Card tab head

### Carousel

Trigger | Description
--- | ---
carousel-caption | Carousel caption
carousel-default | Carousel default

### Collapse

Trigger | Description
--- | ---
collapse-accordion | Collapse accordion
collapse-button | Collapse button
collapse-default | Collapse default

### Dropdown

Trigger | Description
--- | ---
dropdown-alignment | Dropdown alignment
dropdown-anchor | Dropdown anchor
dropdown-button | Dropdown button
dropdown-colored | Dropdown colored
dropdown-default | Dropdown default
dropdown-sized | Dropdown sized
dropdown-split | Dropdown split
dropdown-up-split | Dropdown up split
dropdown-up | Dropdown up

### Form

Trigger | Description
--- | ---
form-checkbox-custom | Form checkbox custom
form-checkbox-inline | Form checkbox inline
form-checkbox-nolabel | Form checkbox nolabel
form-checkbox | Form checkbox
form-email | Form email
form-file-custom | Form file custom
form-file | Form file
form-grid | Form grid
form-group-text | Form group text
form-group | Form group
form-help-text-inline | Form help text inline
form-help-text | Form help text
form-hidden | Form hidden
form-inline | Form inline
form-input-sizing | Form input sizing
form-input-text | Form input text
form-input | Form input
form-multi-select-custom | Form multi select custom
form-multi-select | Form multi select
form-multil-select-sizing | Form multil select sizing
form-password | Form password
form-radio-custom | Form radio custom
form-radio-inline | Form radio inline
form-radio-nolabel | Form radio nolabel
form-radio | Form radio
form-reset | Form reset
form-select-custom | Form select custom
form-select-sizing | Form select sizing
form-select | Form select
form-submit | Form submit
form-textarea | Form textarea
form-validation | Form validation

### Input group

Trigger | Description
--- | ---
igroup-button | Input group button
igroup-checkbox-radio | Input group checkbox radio
igroup-dropdown-segmented | Input group dropdown segmented
igroup-dropdown | Input group dropdown
igroup-size | Input group size
igroup-text-both | Input group text both
igroup-text-prefix | Input group text prefix
igroup-text-sufix | Input group text sufix

### Jumbotron

Trigger | Description
--- | ---
jumbotron-default | Jumbotron default
jumbotron-fluid | Jumbotron fluid

### List

Trigger | Description
--- | ---
list-a | List with link
list-badge | List badge
list-button | List button
list-colors | List colors
list-custom | List custom
list-default | List default

### Modal

Trigger | Description
--- | ---
modal-customize | Modal customize
modal-default | Modal default
modal-grid | Modal grid
modal-sizes | Modal sizes

### Nav

Trigger | Description
--- | ---
nav-a | Nav with link
nav-complete | Nav complete
nav-tabs-pills-a-variation | Nav tabs pills with link variation
nav-tabs-pills-dropdown | Nav tabs pills dropdown
nav-tabs-pills-ul-variation | Nav tabs pills with unordered list variation
nav-ul | Nav with unordered list

### Navbar

Trigger | Description
--- | ---
navbar-background-color | Navbar background color
navbar-background | Navbar background
navbar-default | Navbar default
navbar-minimal-a | Navbar minimal with link
navbar-minimal-ul | Navbar minimal with unordered list
navbar-non-responsive | Navbar non responsive
navbar-placement | Navbar placement

### Pagination

Trigger | Description
--- | ---
pagination-alignment | Pagination alignment
pagination-default | Pagination default
pagination-sized | Pagination sized

### Popover

Trigger | Description
--- | ---
popover-default | Popover default
popover-direction | Popover direction
popover-dismissable | Popover dismissable

### Progress

Trigger | Description
--- | ---
progress-colored | Progress colored
progress-default | Progress default
progress-ie9 | Progress ie9
progress-striped | Progress striped

### Scrollspy

Trigger | Description
--- | ---
scrollspy-default | Scrollspy default

### Tooltip

Trigger | Description
--- | ---
tooltip-default | Tooltip default

### Figure

Trigger | Description
--- | ---
figure-default | Figure default

### Image

Trigger | Description
--- | ---
image-default | Image default

### Table

Trigger | Description
--- | ---
table-default | Table default
table-special | Table special

### Typography

Trigger | Description
--- | ---
typography-blockquote-reverse | Typography blockquote reverse
typography-blockquote | Typography blockquote
typography-description-list | Typography description list
typography-display-heading | Typography display heading
typography-lead | Typography lead
typography-list-inline | Typography list inline
typography-list-unstyled | Typography list unstyled
typography-muted-text | Typography muted text

### Grid

Trigger | Description
--- | ---
grid-col | Grid column
grid-container-fluid | Grid container fluid
grid-container | Grid container
grid-default | Grid default
grid-row | Grid row

### Media

Trigger | Description
--- | ---
media-bottom | Media bottom
media-default | Media default
media-list | Media list
media-middle | Media middle
media-nesting | Media nesting
media-right | Media right
media-top | Media top

### Responsive

Trigger | Description
--- | ---
responsive-hide-down | Responsive hide down
responsive-hide-up | Responsive hide up
responsive-print-show | Responsive print show

### Font awesome 5

|Trigger|
|---|
|500px|
|address-book|
|address-book-o|
|address-card|
|address-card-o|
|adjust|
|adn|
|align-center|
|align-justify|
|align-left|
|align-right|
|amazon|
|ambulance|
|american-sign-language-interpreting|
|anchor|
|android|
|angellist|
|angle-double-down|
|angle-double-left|
|angle-double-right|
|angle-double-up|
|angle-down|
|angle-left|
|angle-right|
|angle-up|
|apple|
|archive|
|area-chart|
|arrow-circle-down|
|arrow-circle-left|
|arrow-circle-o-down|
|arrow-circle-o-left|
|arrow-circle-o-right|
|arrow-circle-o-up|
|arrow-circle-right|
|arrow-circle-up|
|arrow-down|
|arrow-left|
|arrow-right|
|arrows|
|arrows-alt|
|arrows-h|
|arrows-v|
|arrow-up|
|asl-interpreting|
|assistive-listening-systems|
|asterisk|
|at|
|audio-description|
|automobile|
|backward|
|balance-scale|
|ban|
|bandcamp|
|bank|
|bar-chart|
|bar-chart-o|
|barcode|
|bars|
|bath|
|bathtub|
|battery|
|battery-0|
|battery-1|
|battery-2|
|battery-3|
|battery-4|
|battery-empty|
|battery-full|
|battery-half|
|battery-quarter|
|battery-three-quarters|
|bed|
|beer|
|behance|
|behance-square|
|bell|
|bell-o|
|bell-slash|
|bell-slash-o|
|bicycle|
|binoculars|
|birthday-cake|
|bitbucket|
|bitbucket-square|
|bitcoin|
|black-tie|
|blind|
|bluetooth|
|bluetooth-b|
|bold|
|bolt|
|bomb|
|book|
|bookmark|
|bookmark-o|
|braille|
|briefcase|
|btc|
|bug|
|building|
|building-o|
|bullhorn|
|bullseye|
|bus|
|buysellads|
|cab|
|calculator|
|calendar|
|calendar-check-o|
|calendar-minus-o|
|calendar-o|
|calendar-plus-o|
|calendar-times-o|
|camera|
|camera-retro|
|car|
|caret-down|
|caret-left|
|caret-right|
|caret-square-o-down|
|caret-square-o-left|
|caret-square-o-right|
|caret-square-o-up|
|caret-up|
|cart-arrow-down|
|cart-plus|
|cc|
|cc-amex|
|cc-diners-club|
|cc-discover|
|cc-jcb|
|cc-mastercard|
|cc-paypal|
|cc-stripe|
|cc-visa|
|certificate|
|chain|
|chain-broken|
|check|
|check-circle|
|check-circle-o|
|check-square|
|check-square-o|
|chevron-circle-down|
|chevron-circle-left|
|chevron-circle-right|
|chevron-circle-up|
|chevron-down|
|chevron-left|
|chevron-right|
|chevron-up|
|child|
|chrome|
|circle|
|circle-o|
|circle-o-notch|
|circle-thin|
|clipboard|
|clock-o|
|clone|
|close|
|cloud|
|cloud-download|
|cloud-upload|
|cny|
|code|
|code-fork|
|codepen|
|codiepie|
|coffee|
|cog|
|cogs|
|columns|
|comment|
|commenting|
|commenting-o|
|comment-o|
|comments|
|comments-o|
|compass|
|compress|
|connectdevelop|
|contao|
|copy|
|copyright|
|creative-commons|
|credit-card|
|credit-card-alt|
|crop|
|crosshairs|
|css3|
|cube|
|cubes|
|cut|
|cutlery|
|dashboard|
|dashcube|
|database|
|deaf|
|deafness|
|dedent|
|delicious|
|desktop|
|deviantart|
|diamond|
|digg|
|dollar|
|dot-circle-o|
|download|
|dribbble|
|drivers-license|
|drivers-license-o|
|dropbox|
|drupal|
|edge|
|edit|
|eercast|
|eject|
|ellipsis-h|
|ellipsis-v|
|empire|
|envelope|
|envelope-o|
|envelope-open|
|envelope-open-o|
|envelope-square|
|envira|
|eraser|
|etsy|
|eur|
|euro|
|exchange|
|exclamation|
|exclamation-circle|
|exclamation-triangle|
|expand|
|expeditedssl|
|external-link|
|external-link-square|
|eye|
|eyedropper|
|eye-slash|
|fa|
|facebook|
|facebook-f|
|facebook-official|
|facebook-square|
|fast-backward|
|fast-forward|
|fax|
|feed|
|female|
|fighter-jet|
|file|
|file-archive-o|
|file-audio-o|
|file-code-o|
|file-excel-o|
|file-image-o|
|file-movie-o|
|file-o|
|file-pdf-o|
|file-photo-o|
|file-picture-o|
|file-powerpoint-o|
|files-o|
|file-sound-o|
|file-text|
|file-text-o|
|file-video-o|
|file-word-o|
|file-zip-o|
|film|
|filter|
|fire|
|fire-extinguisher|
|firefox|
|first-order|
|flag|
|flag-checkered|
|flag-o|
|flash|
|flask|
|flickr|
|floppy-o|
|folder|
|folder-o|
|folder-open|
|folder-open-o|
|font|
|font-awesome|
|fonticons|
|fort-awesome|
|forumbee|
|forward|
|foursquare|
|free-code-camp|
|frown-o|
|futbol-o|
|gamepad|
|gavel|
|gbp|
|ge|
|gear|
|gears|
|genderless|
|get-pocket|
|gg|
|gg-circle|
|gift|
|git|
|github|
|github-alt|
|github-square|
|gitlab|
|git-square|
|gittip|
|glass|
|glide|
|glide-g|
|globe|
|google|
|google-plus|
|google-plus-circle|
|google-plus-official|
|google-plus-square|
|google-wallet|
|graduation-cap|
|gratipay|
|grav|
|group|
|hacker-news|
|hand-grab-o|
|hand-lizard-o|
|hand-o-down|
|hand-o-left|
|hand-o-right|
|hand-o-up|
|hand-paper-o|
|hand-peace-o|
|hand-pointer-o|
|hand-rock-o|
|hand-scissors-o|
|handshake-o|
|hand-spock-o|
|hand-stop-o|
|hard-of-hearing|
|hashtag|
|hdd-o|
|header|
|headphones|
|heart|
|heartbeat|
|heart-o|
|history|
|home|
|hospital-o|
|hotel|
|hourglass|
|hourglass-1|
|hourglass-2|
|hourglass-3|
|hourglass-end|
|hourglass-half|
|hourglass-o|
|hourglass-start|
|houzz|
|h-square|
|html5|
|i-cursor|
|id-badge|
|id-card|
|id-card-o|
|ils|
|image|
|imdb|
|inbox|
|indent|
|industry|
|info|
|info-circle|
|inr|
|instagram|
|institution|
|internet-explorer|
|intersex|
|ioxhost|
|italic|
|joomla|
|jpy|
|jsfiddle|
|key|
|keyboard-o|
|krw|
|language|
|laptop|
|lastfm|
|lastfm-square|
|leaf|
|leanpub|
|legal|
|lemon-o|
|level-down|
|level-up|
|life-bouy|
|life-buoy|
|life-ring|
|life-saver|
|lightbulb-o|
|line-chart|
|link|
|linkedin|
|linkedin-square|
|linode|
|linux|
|list|
|list-alt|
|list-ol|
|list-ul|
|location-arrow|
|lock|
|long-arrow-down|
|long-arrow-left|
|long-arrow-right|
|long-arrow-up|
|low-vision|
|magic|
|magnet|
|mail-forward|
|mail-reply|
|mail-reply-all|
|male|
|map|
|map-marker|
|map-o|
|map-pin|
|map-signs|
|mars|
|mars-double|
|mars-stroke|
|mars-stroke-h|
|mars-stroke-v|
|maxcdn|
|meanpath|
|medium|
|medkit|
|meetup|
|meh-o|
|mercury|
|microchip|
|microphone|
|microphone-slash|
|minus|
|minus-circle|
|minus-square|
|minus-square-o|
|mixcloud|
|mobile|
|mobile-phone|
|modx|
|money|
|moon-o|
|mortar-board|
|motorcycle|
|mouse-pointer|
|music|
|navicon|
|neuter|
|newspaper-o|
|object-group|
|object-ungroup|
|odnoklassniki|
|odnoklassniki-square|
|opencart|
|openid|
|opera|
|optin-monster|
|outdent|
|pagelines|
|paint-brush|
|paperclip|
|paper-plane|
|paper-plane-o|
|paragraph|
|paste|
|pause|
|pause-circle|
|pause-circle-o|
|paw|
|paypal|
|pencil|
|pencil-square|
|pencil-square-o|
|percent|
|phone|
|phone-square|
|photo|
|picture-o|
|pie-chart|
|pied-piper|
|pied-piper-alt|
|pied-piper-pp|
|pinterest|
|pinterest-p|
|pinterest-square|
|plane|
|play|
|play-circle|
|play-circle-o|
|plug|
|plus|
|plus-circle|
|plus-square|
|plus-square-o|
|podcast|
|power-off|
|print|
|product-hunt|
|puzzle-piece|
|qq|
|qrcode|
|question|
|question-circle|
|question-circle-o|
|quora|
|quote-left|
|quote-right|
|ra|
|random|
|ravelry|
|rebel|
|recycle|
|reddit|
|reddit-alien|
|reddit-square|
|refresh|
|registered|
|remove|
|renren|
|reorder|
|repeat|
|reply|
|reply-all|
|resistance|
|retweet|
|rmb|
|road|
|rocket|
|rotate-left|
|rotate-right|
|rouble|
|rss|
|rss-square|
|rub|
|ruble|
|rupee|
|s15|
|safari|
|save|
|scissors|
|scribd|
|search|
|search-minus|
|search-plus|
|sellsy|
|send|
|send-o|
|server|
|share|
|share-alt|
|share-alt-square|
|share-square|
|share-square-o|
|shekel|
|sheqel|
|shield|
|ship|
|shirtsinbulk|
|shopping-bag|
|shopping-basket|
|shopping-cart|
|shower|
|signal|
|sign-in|
|signing|
|sign-language|
|sign-out|
|simplybuilt|
|sitemap|
|skyatlas|
|skype|
|slack|
|sliders|
|slideshare|
|smile-o|
|snapchat|
|snapchat-ghost|
|snapchat-square|
|snowflake-o|
|soccer-ball-o|
|sort|
|sort-alpha-asc|
|sort-alpha-desc|
|sort-amount-asc|
|sort-amount-desc|
|sort-asc|
|sort-desc|
|sort-down|
|sort-numeric-asc|
|sort-numeric-desc|
|sort-up|
|soundcloud|
|space-shuttle|
|spinner|
|spoon|
|spotify|
|square|
|square-o|
|stack-exchange|
|stack-overflow|
|star|
|star-half|
|star-half-empty|
|star-half-full|
|star-half-o|
|star-o|
|steam|
|steam-square|
|step-backward|
|step-forward|
|stethoscope|
|sticky-note|
|sticky-note-o|
|stop|
|stop-circle|
|stop-circle-o|
|street-view|
|strikethrough|
|stumbleupon|
|stumbleupon-circle|
|subscript|
|subway|
|suitcase|
|sun-o|
|superpowers|
|superscript|
|support|
|table|
|tablet|
|tachometer|
|tag|
|tags|
|tasks|
|taxi|
|telegram|
|television|
|tencent-weibo|
|terminal|
|text-height|
|text-width|
|th|
|themeisle|
|thermometer|
|thermometer-0|
|thermometer-1|
|thermometer-2|
|thermometer-3|
|thermometer-4|
|thermometer-empty|
|thermometer-full|
|thermometer-half|
|thermometer-quarter|
|thermometer-three-quarters|
|th-large|
|th-list|
|thumbs-down|
|thumbs-o-down|
|thumbs-o-up|
|thumbs-up|
|thumb-tack|
|ticket|
|times|
|times-circle|
|times-circle-o|
|times-rectangle|
|times-rectangle-o|
|tint|
|toggle-down|
|toggle-left|
|toggle-off|
|toggle-on|
|toggle-right|
|toggle-up|
|trademark|
|train|
|transgender|
|transgender-alt|
|trash|
|trash-o|
|tree|
|trello|
|tripadvisor|
|trophy|
|truck|
|try|
|tty|
|tumblr|
|tumblr-square|
|turkish-lira|
|tv|
|twitch|
|twitter|
|twitter-square|
|umbrella|
|underline|
|undo|
|universal-access|
|university|
|unlink|
|unlock|
|unlock-alt|
|unsorted|
|upload|
|usb|
|usd|
|user|
|user-circle|
|user-circle-o|
|user-md|
|user-o|
|user-plus|
|users|
|user-secret|
|user-times|
|vcard|
|vcard-o|
|venus|
|venus-double|
|venus-mars|
|viacoin|
|viadeo|
|viadeo-square|
|video-camera|
|vimeo|
|vimeo-square|
|vine|
|vk|
|volume-control-phone|
|volume-down|
|volume-off|
|volume-up|
|warning|
|wechat|
|weibo|
|weixin|
|whatsapp|
|wheelchair|
|wheelchair-alt|
|wifi|
|wikipedia-w|
|window-close|
|window-close-o|
|window-maximize|
|window-minimize|
|window-restore|
|windows|
|won|
|wordpress|
|wpbeginner|
|wpexplorer|
|wpforms|
|wrench|
|xing|
|xing-square|
|yahoo|
|yc|
|y-combinator|
|y-combinator-square|
|yc-square|
|yelp|
|yen|
|yoast|
|youtube|
|youtube-play|
|youtube-square|

### Font awesome 5 Free

|Trigger|
|---|
|500px|
|accessible-icon|
|accusoft|
|address-book|
|address-card|
|adjust|
|adn|
|adversal|
|affiliatetheme|
|algolia|
|align-center|
|align-justify|
|align-left|
|align-right|
|amazon|
|amazon-pay|
|ambulance|
|american-sign-language-interpreting|
|amilia|
|anchor|
|android|
|angellist|
|angle-double-down|
|angle-double-left|
|angle-double-right|
|angle-double-up|
|angle-down|
|angle-left|
|angle-right|
|angle-up|
|angrycreative|
|angular|
|app-store|
|app-store-ios|
|apper|
|apple|
|apple-pay|
|archive|
|arrow-alt-circle-down|
|arrow-alt-circle-left|
|arrow-alt-circle-right|
|arrow-alt-circle-up|
|arrow-circle-down|
|arrow-circle-left|
|arrow-circle-right|
|arrow-circle-up|
|arrow-down|
|arrow-left|
|arrow-right|
|arrow-up|
|arrows-alt|
|arrows-alt-h|
|arrows-alt-v|
|assistive-listening-systems|
|asterisk|
|asymmetrik|
|at|
|audible|
|audio-description|
|autoprefixer|
|avianex|
|aviato|
|aws|
|backward|
|balance-scale|
|ban|
|bandcamp|
|barcode|
|bars|
|baseball-ball|
|basketball-ball|
|bath|
|battery-empty|
|battery-full|
|battery-half|
|battery-quarter|
|battery-three-quarters|
|bed|
|beer|
|behance|
|behance-square|
|bell|
|bell-slash|
|bicycle|
|bimobject|
|binoculars|
|birthday-cake|
|bitbucket|
|bitcoin|
|bity|
|black-tie|
|blackberry|
|blind|
|blogger|
|blogger-b|
|bluetooth|
|bluetooth-b|
|bold|
|bolt|
|bomb|
|book|
|bookmark|
|bowling-ball|
|braille|
|briefcase|
|btc|
|bug|
|building|
|bullhorn|
|bullseye|
|buromobelexperte|
|bus|
|buysellads|
|calculator|
|calendar|
|calendar-alt|
|calendar-check|
|calendar-minus|
|calendar-plus|
|calendar-times|
|camera|
|camera-retro|
|car|
|caret-down|
|caret-left|
|caret-right|
|caret-square-down|
|caret-square-left|
|caret-square-right|
|caret-square-up|
|caret-up|
|cart-arrow-down|
|cart-plus|
|cc-amazon-pay|
|cc-amex|
|cc-apple-pay|
|cc-diners-club|
|cc-discover|
|cc-jcb|
|cc-mastercard|
|cc-paypal|
|cc-stripe|
|cc-visa|
|centercode|
|certificate|
|chart-area|
|chart-bar|
|chart-line|
|chart-pie|
|check|
|check-circle|
|check-square|
|chess|
|chess-bishop|
|chess-board|
|chess-king|
|chess-knight|
|chess-pawn|
|chess-queen|
|chess-rook|
|chevron-circle-down|
|chevron-circle-left|
|chevron-circle-right|
|chevron-circle-up|
|chevron-down|
|chevron-left|
|chevron-right|
|chevron-up|
|child|
|chrome|
|circle|
|circle-notch|
|clipboard|
|clock|
|clone|
|closed-captioning|
|cloud|
|cloud-download-alt|
|cloud-upload-alt|
|cloudscale|
|cloudsmith|
|cloudversify|
|code|
|code-branch|
|codepen|
|codiepie|
|coffee|
|cog|
|cogs|
|columns|
|comment|
|comment-alt|
|comments|
|compass|
|compress|
|connectdevelop|
|contao|
|copy|
|copyright|
|cpanel|
|creative-commons|
|credit-card|
|crop|
|crosshairs|
|css3|
|css3-alt|
|cube|
|cubes|
|cut|
|cuttlefish|
|d-and-d|
|dashcube|
|database|
|deaf|
|delicious|
|deploydog|
|deskpro|
|desktop|
|deviantart|
|digg|
|digital-ocean|
|discord|
|discourse|
|dochub|
|docker|
|dollar-sign|
|dot-circle|
|download|
|draft2digital|
|dribbble|
|dribbble-square|
|dropbox|
|drupal|
|dyalog|
|earlybirds|
|edge|
|edit|
|eject|
|elementor|
|ellipsis-h|
|ellipsis-v|
|ember|
|empire|
|envelope|
|envelope-open|
|envelope-square|
|envira|
|eraser|
|erlang|
|ethereum|
|etsy|
|euro-sign|
|exchange-alt|
|exclamation|
|exclamation-circle|
|exclamation-triangle|
|expand|
|expand-arrows-alt|
|expeditedssl|
|external-link-alt|
|external-link-square-alt|
|eye|
|eye-dropper|
|eye-slash|
|facebook|
|facebook-f|
|facebook-messenger|
|facebook-square|
|fast-backward|
|fast-forward|
|fax|
|female|
|fighter-jet|
|file|
|file-alt|
|file-archive|
|file-audio|
|file-code|
|file-excel|
|file-image|
|file-pdf|
|file-powerpoint|
|file-video|
|file-word|
|film|
|filter|
|fire|
|fire-extinguisher|
|firefox|
|first-order|
|firstdraft|
|flag|
|flag-checkered|
|flask|
|flickr|
|flipboard|
|fly|
|folder|
|folder-open|
|font|
|font-awesome|
|font-awesome-alt|
|font-awesome-flag|
|fonticons|
|fonticons-fi|
|football-ball|
|fort-awesome|
|fort-awesome-alt|
|forumbee|
|forward|
|foursquare|
|free-code-camp|
|freebsd|
|frown|
|futbol|
|gamepad|
|gavel|
|gem|
|genderless|
|get-pocket|
|gg|
|gg-circle|
|gift|
|git|
|git-square|
|github|
|github-alt|
|github-square|
|gitkraken|
|gitlab|
|gitter|
|glass-martini|
|glide|
|glide-g|
|globe|
|gofore|
|golf-ball|
|goodreads|
|goodreads-g|
|google|
|google-drive|
|google-play|
|google-plus|
|google-plus-g|
|google-plus-square|
|google-wallet|
|graduation-cap|
|gratipay|
|grav|
|gripfire|
|grunt|
|gulp|
|h-square|
|hacker-news|
|hacker-news-square|
|hand-lizard|
|hand-paper|
|hand-peace|
|hand-point-down|
|hand-point-left|
|hand-point-right|
|hand-point-up|
|hand-pointer|
|hand-rock|
|hand-scissors|
|hand-spock|
|handshake|
|hashtag|
|hdd|
|heading|
|headphones|
|heart|
|heartbeat|
|hips|
|hire-a-helper|
|history|
|hockey-puck|
|home|
|hooli|
|hospital|
|hotjar|
|hourglass|
|hourglass-end|
|hourglass-half|
|hourglass-start|
|houzz|
|html5|
|hubspot|
|i-cursor|
|id-badge|
|id-card|
|image|
|images|
|imdb|
|inbox|
|indent|
|industry|
|info|
|info-circle|
|instagram|
|internet-explorer|
|ioxhost|
|italic|
|itunes|
|itunes-note|
|jenkins|
|joget|
|joomla|
|js|
|js-square|
|jsfiddle|
|key|
|keyboard|
|keycdn|
|kickstarter|
|kickstarter-k|
|korvue|
|language|
|laptop|
|laravel|
|lastfm|
|lastfm-square|
|leaf|
|leanpub|
|lemon|
|less|
|level-down-alt|
|level-up-alt|
|life-ring|
|lightbulb|
|line|
|link|
|linkedin|
|linkedin-in|
|linode|
|linux|
|lira-sign|
|list|
|list-alt|
|list-ol|
|list-ul|
|location-arrow|
|lock|
|lock-open|
|long-arrow-alt-down|
|long-arrow-alt-left|
|long-arrow-alt-right|
|long-arrow-alt-up|
|low-vision|
|lyft|
|magento|
|magic|
|magnet|
|male|
|map|
|map-marker|
|map-marker-alt|
|map-pin|
|map-signs|
|mars|
|mars-double|
|mars-stroke|
|mars-stroke-h|
|mars-stroke-v|
|maxcdn|
|medapps|
|medium|
|medium-m|
|medkit|
|medrt|
|meetup|
|meh|
|mercury|
|microchip|
|microphone|
|microphone-slash|
|microsoft|
|minus|
|minus-circle|
|minus-square|
|mix|
|mixcloud|
|mizuni|
|mobile|
|mobile-alt|
|modx|
|monero|
|money-bill-alt|
|moon|
|motorcycle|
|mouse-pointer|
|music|
|napster|
|neuter|
|newspaper|
|nintendo-switch|
|node|
|node-js|
|npm|
|ns8|
|nutritionix|
|object-group|
|object-ungroup|
|odnoklassniki|
|odnoklassniki-square|
|opencart|
|openid|
|opera|
|optin-monster|
|osi|
|outdent|
|page4|
|pagelines|
|paint-brush|
|palfed|
|paper-plane|
|paperclip|
|paragraph|
|paste|
|patreon|
|pause|
|pause-circle|
|paw|
|paypal|
|pen-square|
|pencil-alt|
|percent|
|periscope|
|phabricator|
|phoenix-framework|
|phone|
|phone-square|
|phone-volume|
|php|
|pied-piper|
|pied-piper-alt|
|pied-piper-pp|
|pinterest|
|pinterest-p|
|pinterest-square|
|plane|
|play|
|play-circle|
|playstation|
|plug|
|plus|
|plus-circle|
|plus-square|
|podcast|
|pound-sign|
|power-off|
|print|
|product-hunt|
|pushed|
|puzzle-piece|
|python|
|qq|
|qrcode|
|question|
|question-circle|
|quidditch|
|quinscape|
|quora|
|quote-left|
|quote-right|
|random|
|ravelry|
|react|
|rebel|
|recycle|
|red-river|
|reddit|
|reddit-alien|
|reddit-square|
|redo|
|redo-alt|
|registered|
|rendact|
|renren|
|reply|
|reply-all|
|replyd|
|resolving|
|retweet|
|road|
|rocket|
|rocketchat|
|rockrms|
|rss|
|rss-square|
|ruble-sign|
|rupee-sign|
|safari|
|sass|
|save|
|schlix|
|scribd|
|search|
|search-minus|
|search-plus|
|searchengin|
|sellcast|
|sellsy|
|server|
|servicestack|
|share|
|share-alt|
|share-alt-square|
|share-square|
|shekel-sign|
|shield-alt|
|ship|
|shirtsinbulk|
|shopping-bag|
|shopping-basket|
|shopping-cart|
|shower|
|sign-in-alt|
|sign-language|
|sign-out-alt|
|signal|
|simplybuilt|
|sistrix|
|sitemap|
|skyatlas|
|skype|
|slack|
|slack-hash|
|sliders-h|
|slideshare|
|smile|
|snapchat|
|snapchat-ghost|
|snapchat-square|
|snowflake|
|sort|
|sort-alpha-down|
|sort-alpha-up|
|sort-amount-down|
|sort-amount-up|
|sort-down|
|sort-numeric-down|
|sort-numeric-up|
|sort-up|
|soundcloud|
|space-shuttle|
|speakap|
|spinner|
|spotify|
|square|
|square-full|
|stack-exchange|
|stack-overflow|
|star|
|star-half|
|staylinked|
|steam|
|steam-square|
|steam-symbol|
|step-backward|
|step-forward|
|stethoscope|
|sticker-mule|
|sticky-note|
|stop|
|stop-circle|
|stopwatch|
|strava|
|street-view|
|strikethrough|
|stripe|
|stripe-s|
|studiovinari|
|stumbleupon|
|stumbleupon-circle|
|subscript|
|subway|
|suitcase|
|sun|
|superpowers|
|superscript|
|supple|
|sync|
|sync-alt|
|table|
|table-tennis|
|tablet|
|tablet-alt|
|tachometer-alt|
|tag|
|tags|
|tasks|
|taxi|
|telegram|
|telegram-plane|
|tencent-weibo|
|terminal|
|text-height|
|text-width|
|th|
|th-large|
|th-list|
|themeisle|
|thermometer-empty|
|thermometer-full|
|thermometer-half|
|thermometer-quarter|
|thermometer-three-quarters|
|thumbs-down|
|thumbs-up|
|thumbtack|
|ticket-alt|
|times|
|times-circle|
|tint|
|toggle-off|
|toggle-on|
|trademark|
|train|
|transgender|
|transgender-alt|
|trash|
|trash-alt|
|tree|
|trello|
|tripadvisor|
|trophy|
|truck|
|tty|
|tumblr|
|tumblr-square|
|tv|
|twitch|
|twitter|
|twitter-square|
|typo3|
|uber|
|uikit|
|umbrella|
|underline|
|undo|
|undo-alt|
|uniregistry|
|universal-access|
|university|
|unlink|
|unlock|
|unlock-alt|
|untappd|
|upload|
|usb|
|user|
|user-circle|
|user-md|
|user-plus|
|user-secret|
|user-times|
|users|
|ussunnah|
|utensil-spoon|
|utensils|
|vaadin|
|venus|
|venus-double|
|venus-mars|
|viacoin|
|viadeo|
|viadeo-square|
|viber|
|video|
|vimeo|
|vimeo-square|
|vimeo-v|
|vine|
|vk|
|vnv|
|volleyball-ball|
|volume-down|
|volume-off|
|volume-up|
|vuejs|
|weibo|
|weixin|
|whatsapp|
|whatsapp-square|
|wheelchair|
|whmcs|
|wifi|
|wikipedia-w|
|window-close|
|window-maximize|
|window-minimize|
|window-restore|
|windows|
|won-sign|
|wordpress|
|wordpress-simple|
|wpbeginner|
|wpexplorer|
|wpforms|
|wrench|
|xbox|
|xing|
|xing-square|
|y-combinator|
|yahoo|
|yandex|
|yandex-international|
|yelp|
|yen-sign|
|yoast|
|youtube|
|youtube-square|

### Font awesome 5 Pro

|Trigger|
|---|
|address-book|
|address-card|
|adjust|
|alarm-clock|
|align-center|
|align-justify|
|align-left|
|align-right|
|ambulance|
|american-sign-language-interpreting|
|anchor|
|angle-double-down|
|angle-double-left|
|angle-double-right|
|angle-double-up|
|angle-down|
|angle-left|
|angle-right|
|angle-up|
|archive|
|arrow-alt-circle-down|
|arrow-alt-circle-left|
|arrow-alt-circle-right|
|arrow-alt-circle-up|
|arrow-alt-down|
|arrow-alt-from-bottom|
|arrow-alt-from-left|
|arrow-alt-from-right|
|arrow-alt-from-top|
|arrow-alt-left|
|arrow-alt-right|
|arrow-alt-square-down|
|arrow-alt-square-left|
|arrow-alt-square-right|
|arrow-alt-square-up|
|arrow-alt-to-bottom|
|arrow-alt-to-left|
|arrow-alt-to-right|
|arrow-alt-to-top|
|arrow-alt-up|
|arrow-circle-down|
|arrow-circle-left|
|arrow-circle-right|
|arrow-circle-up|
|arrow-down|
|arrow-from-bottom|
|arrow-from-left|
|arrow-from-right|
|arrow-from-top|
|arrow-left|
|arrow-right|
|arrow-square-down|
|arrow-square-left|
|arrow-square-right|
|arrow-square-up|
|arrow-to-bottom|
|arrow-to-left|
|arrow-to-right|
|arrow-to-top|
|arrow-up|
|arrows|
|arrows-alt|
|arrows-alt-h|
|arrows-alt-v|
|arrows-h|
|arrows-v|
|assistive-listening-systems|
|asterisk|
|at|
|audio-description|
|backward|
|badge|
|badge-check|
|balance-scale|
|ban|
|barcode|
|bars|
|baseball|
|baseball-ball|
|basketball-ball|
|basketball-hoop|
|bath|
|battery-bolt|
|battery-empty|
|battery-full|
|battery-half|
|battery-quarter|
|battery-slash|
|battery-three-quarters|
|bed|
|beer|
|bell|
|bell-slash|
|bicycle|
|binoculars|
|birthday-cake|
|blind|
|bold|
|bolt|
|bomb|
|book|
|bookmark|
|bowling-ball|
|bowling-pins|
|boxing-glove|
|braille|
|briefcase|
|browser|
|bug|
|building|
|bullhorn|
|bullseye|
|bus|
|calculator|
|calendar|
|calendar-alt|
|calendar-check|
|calendar-edit|
|calendar-exclamation|
|calendar-minus|
|calendar-plus|
|calendar-times|
|camera|
|camera-alt|
|camera-retro|
|car|
|caret-circle-down|
|caret-circle-left|
|caret-circle-right|
|caret-circle-up|
|caret-down|
|caret-left|
|caret-right|
|caret-square-down|
|caret-square-left|
|caret-square-right|
|caret-square-up|
|caret-up|
|cart-arrow-down|
|cart-plus|
|certificate|
|chart-area|
|chart-bar|
|chart-line|
|chart-pie|
|check|
|check-circle|
|check-square|
|chess|
|chess-bishop|
|chess-bishop-alt|
|chess-board|
|chess-clock|
|chess-clock-alt|
|chess-king|
|chess-king-alt|
|chess-knight|
|chess-knight-alt|
|chess-pawn|
|chess-pawn-alt|
|chess-queen|
|chess-queen-alt|
|chess-rook|
|chess-rook-alt|
|chevron-circle-down|
|chevron-circle-left|
|chevron-circle-right|
|chevron-circle-up|
|chevron-double-down|
|chevron-double-left|
|chevron-double-right|
|chevron-double-up|
|chevron-down|
|chevron-left|
|chevron-right|
|chevron-square-down|
|chevron-square-left|
|chevron-square-right|
|chevron-square-up|
|chevron-up|
|child|
|circle|
|circle-notch|
|clipboard|
|clock|
|clone|
|closed-captioning|
|cloud|
|cloud-download|
|cloud-download-alt|
|cloud-upload|
|cloud-upload-alt|
|club|
|code|
|code-branch|
|code-commit|
|code-merge|
|coffee|
|cog|
|cogs|
|columns|
|comment|
|comment-alt|
|comments|
|compass|
|compress|
|compress-alt|
|compress-wide|
|copy|
|copyright|
|credit-card|
|credit-card-blank|
|credit-card-front|
|cricket|
|crop|
|crosshairs|
|cube|
|cubes|
|curling|
|cut|
|database|
|deaf|
|desktop|
|desktop-alt|
|diamond|
|dollar-sign|
|dot-circle|
|download|
|dumbbell|
|edit|
|eject|
|ellipsis-h|
|ellipsis-h-alt|
|ellipsis-v|
|ellipsis-v-alt|
|envelope|
|envelope-open|
|envelope-square|
|eraser|
|euro-sign|
|exchange|
|exchange-alt|
|exclamation|
|exclamation-circle|
|exclamation-square|
|exclamation-triangle|
|expand|
|expand-alt|
|expand-arrows|
|expand-arrows-alt|
|expand-wide|
|external-link|
|external-link-alt|
|external-link-square|
|external-link-square-alt|
|eye|
|eye-dropper|
|eye-slash|
|fast-backward|
|fast-forward|
|fax|
|female|
|field-hockey|
|fighter-jet|
|file|
|file-alt|
|file-archive|
|file-audio|
|file-check|
|file-code|
|file-edit|
|file-excel|
|file-exclamation|
|file-image|
|file-minus|
|file-pdf|
|file-plus|
|file-powerpoint|
|file-times|
|file-video|
|file-word|
|film|
|film-alt|
|filter|
|fire|
|fire-extinguisher|
|flag|
|flag-checkered|
|flask|
|folder|
|folder-open|
|font|
|football-ball|
|football-helmet|
|forward|
|frown|
|futbol|
|gamepad|
|gavel|
|gem|
|genderless|
|gift|
|glass-martini|
|globe|
|golf-ball|
|golf-club|
|graduation-cap|
|h-square|
|h1|
|h2|
|h3|
|hand-lizard|
|hand-paper|
|hand-peace|
|hand-point-down|
|hand-point-left|
|hand-point-right|
|hand-point-up|
|hand-pointer|
|hand-rock|
|hand-scissors|
|hand-spock|
|handshake|
|hashtag|
|hdd|
|heading|
|headphones|
|heart|
|heartbeat|
|hexagon|
|history|
|hockey-puck|
|hockey-sticks|
|home|
|hospital|
|hourglass|
|hourglass-end|
|hourglass-half|
|hourglass-start|
|i-cursor|
|id-badge|
|id-card|
|image|
|images|
|inbox|
|inbox-in|
|inbox-out|
|indent|
|industry|
|industry-alt|
|info|
|info-circle|
|info-square|
|italic|
|jack-o-lantern|
|key|
|keyboard|
|language|
|laptop|
|leaf|
|lemon|
|level-down|
|level-down-alt|
|level-up|
|level-up-alt|
|life-ring|
|lightbulb|
|link|
|lira-sign|
|list|
|list-alt|
|list-ol|
|list-ul|
|location-arrow|
|lock|
|lock-alt|
|lock-open|
|lock-open-alt|
|long-arrow-alt-down|
|long-arrow-alt-left|
|long-arrow-alt-right|
|long-arrow-alt-up|
|long-arrow-down|
|long-arrow-left|
|long-arrow-right|
|long-arrow-up|
|low-vision|
|luchador|
|magic|
|magnet|
|male|
|map|
|map-marker|
|map-marker-alt|
|map-pin|
|map-signs|
|mars|
|mars-double|
|mars-stroke|
|mars-stroke-h|
|mars-stroke-v|
|medkit|
|meh|
|mercury|
|microchip|
|microphone|
|microphone-alt|
|microphone-slash|
|minus|
|minus-circle|
|minus-hexagon|
|minus-octagon|
|minus-square|
|mobile|
|mobile-alt|
|mobile-android|
|mobile-android-alt|
|money-bill|
|money-bill-alt|
|moon|
|motorcycle|
|mouse-pointer|
|music|
|neuter|
|newspaper|
|object-group|
|object-ungroup|
|octagon|
|outdent|
|paint-brush|
|paper-plane|
|paperclip|
|paragraph|
|paste|
|pause|
|pause-circle|
|paw|
|pen|
|pen-alt|
|pen-square|
|pencil|
|pencil-alt|
|pennant|
|percent|
|phone|
|phone-slash|
|phone-square|
|phone-volume|
|plane|
|plane-alt|
|play|
|play-circle|
|plug|
|plus|
|plus-circle|
|plus-hexagon|
|plus-octagon|
|plus-square|
|podcast|
|poo|
|portrait|
|pound-sign|
|power-off|
|print|
|puzzle-piece|
|qrcode|
|question|
|question-circle|
|question-square|
|quidditch|
|quote-left|
|quote-right|
|racquet|
|random|
|rectangle-landscape|
|rectangle-portrait|
|rectangle-wide|
|recycle|
|redo|
|redo-alt|
|registered|
|repeat|
|repeat-1|
|repeat-1-alt|
|repeat-alt|
|reply|
|reply-all|
|retweet|
|retweet-alt|
|road|
|rocket|
|rss|
|rss-square|
|ruble-sign|
|rupee-sign|
|save|
|scrubber|
|search|
|search-minus|
|search-plus|
|server|
|share|
|share-all|
|share-alt|
|share-alt-square|
|share-square|
|shekel-sign|
|shield|
|shield-alt|
|shield-check|
|ship|
|shopping-bag|
|shopping-basket|
|shopping-cart|
|shower|
|shuttlecock|
|sign-in|
|sign-in-alt|
|sign-language|
|sign-out|
|sign-out-alt|
|signal|
|sitemap|
|sliders-h|
|sliders-h-square|
|sliders-v|
|sliders-v-square|
|smile|
|snowflake|
|sort|
|sort-alpha-down|
|sort-alpha-up|
|sort-amount-down|
|sort-amount-up|
|sort-down|
|sort-numeric-down|
|sort-numeric-up|
|sort-up|
|space-shuttle|
|spade|
|spinner|
|spinner-third|
|square|
|square-full|
|star|
|star-exclamation|
|star-half|
|step-backward|
|step-forward|
|stethoscope|
|sticky-note|
|stop|
|stop-circle|
|stopwatch|
|street-view|
|strikethrough|
|subscript|
|subway|
|suitcase|
|sun|
|superscript|
|sync|
|sync-alt|
|table|
|table-tennis|
|tablet|
|tablet-alt|
|tablet-android|
|tablet-android-alt|
|tachometer|
|tachometer-alt|
|tag|
|tags|
|tasks|
|taxi|
|tennis-ball|
|terminal|
|text-height|
|text-width|
|th|
|th-large|
|th-list|
|thermometer-empty|
|thermometer-full|
|thermometer-half|
|thermometer-quarter|
|thermometer-three-quarters|
|thumbs-down|
|thumbs-up|
|thumbtack|
|ticket|
|ticket-alt|
|times|
|times-circle|
|times-hexagon|
|times-octagon|
|times-square|
|tint|
|toggle-off|
|toggle-on|
|trademark|
|train|
|transgender|
|transgender-alt|
|trash|
|trash-alt|
|tree|
|tree-alt|
|triangle|
|trophy|
|trophy-alt|
|truck|
|tty|
|tv|
|tv-retro|
|umbrella|
|underline|
|undo|
|undo-alt|
|universal-access|
|university|
|unlink|
|unlock|
|unlock-alt|
|upload|
|usd-circle|
|usd-square|
|user|
|user-alt|
|user-circle|
|user-md|
|user-plus|
|user-secret|
|user-times|
|users|
|utensil-fork|
|utensil-knife|
|utensil-spoon|
|utensils|
|utensils-alt|
|venus|
|venus-double|
|venus-mars|
|video|
|volleyball-ball|
|volume-down|
|volume-mute|
|volume-off|
|volume-up|
|watch|
|wheelchair|
|whistle|
|wifi|
|window|
|window-alt|
|window-close|
|window-maximize|
|window-minimize|
|window-restore|
|won-sign|
|wrench|
|yen-sign|


## License

Bootstrap 4, Font Awesome 4, Font Awesome 5 Free & Pro - Visual studio code plugin is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).


## Disclaimer:

Readme template for this plugin was initially borrowed from [here](https://github.com/bodiam/intellij-bootstrap3) & [here](https://github.com/JasonMortonNZ/bs3-sublime-plugin)
