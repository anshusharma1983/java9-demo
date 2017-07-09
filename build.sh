rm -rf mods

mkdir -p mods

javac -d mods -p lib --module-source-path src `find src -type f`

java --module-path mods:lib -m amazon.client/amazon.client.Client
