package org.jetbrains.bsp.bazel.bazelrunner.params

object BazelFlag {
  @JvmStatic fun color(enabled: Boolean) =
      arg("color", if (enabled) "yes" else "no")

  @JvmStatic fun keepGoing() =
      flag("keep_going")

  @JvmStatic fun outputGroups(groups: List<String>) =
      arg("output_groups", groups.joinToString(","))

  @JvmStatic fun aspect(name: String) =
      arg("aspects", name)

  @JvmStatic fun buildManualTests(): String =
          flag("build_manual_tests")

  @JvmStatic fun curses(enabled: Boolean): String =
          arg("curses", if (enabled) "yes" else "no")

  @JvmStatic fun repositoryOverride(repositoryName: String, path: String): String =
    arg("override_repository", "$repositoryName=$path")

  @JvmStatic fun experimentalGoogleLegacyApi(): String =
      flag("experimental_google_legacy_api")

  @JvmStatic fun experimentalEnableAndroidMigrationApis(): String =
    flag("experimental_enable_android_migration_apis")

  @JvmStatic fun device(device: String): String =
    arg("device", device)

  @JvmStatic fun start(startType: String): String =
    arg("start", startType)

  private fun arg(name: String, value: String) =
      String.format("--%s=%s", name, value)

  private fun flag(name: String) =
      "--$name"
}
