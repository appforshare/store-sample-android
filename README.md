# AppForShare store sample (Android)

A minimal Android app used to test the AppForShare Android store build workflow
([appforshare/store-build](https://github.com/appforshare/store-build)).

It has one screen, no libraries beyond the Android Gradle Plugin, and a release build type without a signing
config: the store builds an unsigned APK on GitHub hosted runners and signs it after review.

Build locally:

```
./gradlew :app:assembleRelease
```

Pushing a tag that starts with `v` runs `.github/workflows/appforshare-store.yml`, which calls the AppForShare
workflow. This sample sends its builds to the AppForShare staging server.

License: MIT.
