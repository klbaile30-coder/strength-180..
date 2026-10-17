# Strength 180 — Kevin's Android app

Dark black and green offline Android fitness tracker, with a kettlebell logo.

## Build an APK with Android Studio
1. Install the latest stable Android Studio from developer.android.com/studio (it will offer to install the Android SDK).
2. Unzip this project and select **Open** in Android Studio, pointing to `kevin_fitness_app`.
3. Allow Gradle sync and any requested Android SDK/Gradle downloads.
4. Go to **Build → Build Bundle(s) / APK(s) → Build APK(s)**.
5. The debug APK will be at `app/build/outputs/apk/debug/app-debug.apk`. Copy to your Android phone and open it; Android may ask for permission to install from that source.

## Features
- Offline home dashboard with a 203 → 180-lb goal and current 197-lb baseline
- Workout A and Workout B checklists, logging and pull-up progression
- Example 2,100-calorie plan and meal checkboxes with estimated macros
- Weight tracking, strength logs, weekly habit checklist and export/share of data
- On-device storage. Clearing Android app data erases logs. No cloud sync.

## Technical notes
A minimal Java Android WebView wrapper embeds all assets locally. No Internet permission or account needed. Data is stored in Android WebView localStorage.

**Important**: Nutrition estimates are examples, not exact totals or individual medical advice. Adjust food quantities based on measured servings and actual packages. Training should stay comfortable given surgical history.

## Build in GitHub (no Android Studio needed)
1. Create a GitHub repository (private is fine).
2. Upload the CONTENTS of the `kevin_fitness_app` folder into the repository root, including its hidden `.github` folder. The workflow must be at `.github/workflows/build-apk.yml` in the root.
3. In GitHub open **Actions → Build Android APK → Run workflow** (or push your files to `main` or `master`).
4. When the build finishes, open the workflow run and download the artifact named **Strength180-Android-APK**.
5. Unzip the downloaded artifact to get `app-debug.apk`; send it to your phone and open it to install.

This workflow has not been run in this environment, so compilation remains unverified until GitHub completes it. `app-debug.apk` is an installable development build, not a Play Store release.
