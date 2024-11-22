# intellij-qiq-plugin

![Build](https://github.com/suzumaze/intellij-qiq-plugin/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/MARKETPLACE_ID.svg)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/MARKETPLACE_ID.svg)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID)

<!-- Plugin description -->

A plugin for IntelliJ IDEA that provides support for the Qiq templating engine.
This plugin recognizes files with .qiq.php extension as Qiq templates and offers features to enhance development.
Key Features:

- Syntax highlighting for Qiq template syntax
- Code navigation to PHP classes and template files

  - Jump to Product class
    ```qiq
    {{ use App\Entity\Product; }}
    {{ /** @var Product $product */ }}
    ```
  - Jump to customHelper class
    ```qiq
    {{ customHelper () }}
    ```
  - Jump to template.qiq.php file
    ```qiq
    {{= render ('/path/to/template') }}
    ```
- Code formatting within templates

<!-- Plugin description end -->

## Installation

- Using the IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "intellij-qiq-plugin"</kbd> >
  <kbd>Install</kbd>
  
- Using JetBrains Marketplace:

  Go to [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID) and install it by clicking the <kbd>Install to ...</kbd> button in case your IDE is running.

  You can also download the [latest release](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID/versions) from JetBrains Marketplace and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

- Manually:

  Download the [latest release](https://github.com/suzumaze/intellij-qiq-plugin/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation


## References and Resources

- [Custom Language Support Tutorial](https://plugins.jetbrains.com/docs/intellij/custom-language-support.html)

- Similar Projects
  - [intellij-plugins](https://github.com/JetBrains/intellij-plugins/)
  - [intellij-latte](https://github.com/nette-intellij/intellij-latte)

  The source code for the Twig and Blade plugins is currently closed-source.
  The Smarty plugin is included with the PHP library com.jetbrains.php via Gradle.