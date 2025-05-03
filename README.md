# Bouncy Castle OpenPGP 1.80 does not work

https://github.com/bcgit/bc-java/issues/2072

Steps to reproduce the bug:

```bash
git clone https://github.com/veita/bcpg-bug.git
cd bcpg-bug
./gradlew run
```

Under Windows use `gradlew.bat` instead of `./gradlew`.
