rm -rf mods
rm -rf primesapp

mkdir -p mods

javac -d mods --module-source-path src `find src -type f`

jlink --module-path $JAVA_HOME/jmods:mods --add-modules amazon.primes --output primesapp

./primesapp/bin/java -m amazon.primes/amazon.primes.PrimeService
