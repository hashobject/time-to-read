# time-to-read

Clojure library for estimating text's time to read. Inspired by time to read feature on [Medium](http://medium.com).

[![Build Status](https://travis-ci.org/hashobject/time-to-read.png)](https://travis-ci.org/hashobject/time-to-read)
[![Dependencies Status](http://jarkeeper.com/hashobject/time-to-read/status.svg)](http://jarkeeper.com/hashobject/time-to-read)


Calculation is done in very simple way:

```
time-to-read = word-count / words-per-minute
```
where

  * word-count - number of words in the text
  * words-per-minute - speed of reading. Default is 200 words per minute. This is customizable.


Output of this calculation is estimated number of minutes for reading of the text. Ceiling is used as rounding method.


## Install

```
[time-to-read "0.1.0"]
```

## Usage

```
user=> (use 'time-to-read.core)
nil
user=> (estimate-for-text "$SOME_TEXT_SHOULD_GO_HERE" 200)
1
user=> (estimate 900 200)
4
```

## Tips

We recommend you to validate sitemap before submitting it to Google Webmaster tools.
There are plenty of online validators. Maybe we will later add validation support to this library.

## Contributions

We love contributions. Please submit your pull requests.


## License

Copyright © 2014 Hashobject Ltd (team@hashobject.com).

Distributed under the [Eclipse Public License](http://opensource.org/licenses/eclipse-1.0).
