rm -rf mods

mkdir -p mods

javac -d mods --module-source-path src `find src -type f`

java --module-path mods -m amazon.primes/amazon.primes.PrimeService
