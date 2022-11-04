# Bug Example #
launching the script src/untitled.sc in the Scala REPL causes
an Error Message with scala 3.2.0

The following behaviors happen within the the following scala versions:

- 2.12.17 => Success Message
- 2.13.10 => Success Message
- 3.0.0 => No Message
- 3.1.0 => No Message
- 3.2.0 => Error Message

Tested on MacOS with JDK 8,11,17,19

This is an example for: https://github.com/lampepfl/dotty/issues/16269

