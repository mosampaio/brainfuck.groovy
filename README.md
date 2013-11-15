brainfuck.groovy
================

a very simple brainfuck Interpreter written in groovy

[BrainFuck](http://en.wikipedia.org/wiki/Brainfuck)?
===============

Brainfuck is an esoteric programming language noted for its extreme minimalism. The language consists of only eight simple commands and an instruction pointer. It is a Turing tarpit, designed to challenge and amuse programmers, and was not made to be suitable for practical use. It was created in 1993 by Urban Müller.

How to use?
===============

```groovy
import br.com.mosampaio.bf.BFInterpreter
//.....

def interpreter = new BFInterpreter()
interpreter.execute "++.++." //your bf code
```
