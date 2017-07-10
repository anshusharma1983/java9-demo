# java9-demo

Java 9 demo, demonstrating modules and their dependencies

Checkout specific branch by executing

`git checkout <branchname>`

## branch - **checkpoint1**

amazon.primes module, with a method GetPrimeNumbers that returns a mocked list of prime numbers

## branch - **jlink**

jlink utility to create and execute standalone java app.

## branch - **checkpoint2**

amazon.client module, that has dependency on amazon.primes module and prints the list of prime numbers returned by amazon.primes module

## branch - **checkpoint3**

amazon.primes module uses apache commons math library, using the concept of automatic modules.

## branch - **jshell**

jshell and few examples. Describes how to load and add modules, use startup file.

`jshell --startup <filename>`
