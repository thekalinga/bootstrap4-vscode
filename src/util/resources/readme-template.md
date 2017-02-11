Bootstrap 4 & Font awesome snippets for Visual studio code
===========================

Visual studio code plugin containing Bootstrap 4 & Font awesome snippets. This plugin works in both in the stable & the insiders build

![Plugin in action](help.gif)

Feel free to let me know what else you want added via the [issues](https://github.com/thekalinga/bootstrap4-vscode/issues)

Suggestions, feedback and other comments welcome via [@thekalinga](https://twitter.com/thekalinga) on Twitter.

## Setup (in 2 easy steps)

1. Install plugin
  1. Press `F1`, paste `ext install bootstrap4-vscode` & then press `enter` (or)
  2. Goto extensions by pressing `Ctrl-Shift-X` (Windows/Linux) or `Cmd-Shift-X` (Mac) & Search for `Bootstrap 4 & Font awesome`, click on install
2. Reload your editor

You are good to go

## Usage

To use the bootstrap snippets, open a HTML file, and start typing `b4-`, followed by pressing `Ctrl+Space`. A list of bootstrap snippets will show up

To use font awesome snippets, open a HTML file, and start typing `fa-`, the editor will show you all the snippets

The detailed list of supported actions are listed below under documentation section

## Contribution guidelines

1. Clone this repo
2. To modify bootstrap snippets, you can find the templates for each snippet under `src/util/resources/bootstrap`. These Html snippets must follow [sublime text snippet](http://docs.sublimetext.info/en/latest/extensibility/snippets.html) format. There is no need to update `snippets.json` manually. The build will take care of regenerating this file from template files.
3. If you need to change `README.md` (or) `package.json`, you should modify their templates (which are used to generate the root level files) under `src/util/resources`. For eg., If you want `package.json` at the root to be modified, you should change `package-template.json` under `src/util/resources`. These root level `package.json` & `README.md` are regenerated for every build from their corresponding templates.
4. To modify font awesome snippets, you would need to modify `font-awesome.json` under `src/util/resources`
5. Send me a pull request

## Changelog

See [here](CHANGELOG.md)

## Documentation
@@@GENERATED_DOCUMENTATION_PLACEHOLDER@@@

## License

Bootstrap 4 & Font awesome - Visual studio code plugin is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).


## Disclaimer:

Readme template for this plugin was initially borrowed from [here](https://github.com/bodiam/intellij-bootstrap3) & [here](https://github.com/JasonMortonNZ/bs3-sublime-plugin)
