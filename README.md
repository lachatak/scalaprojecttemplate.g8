## Scala multi module project template
The goal of this project is to provide a well-structured scala multi module project template
 
## Content
- akka
- scalaz
- mockito
- scalatest
  
## Requirements
- [giter8](https://github.com/n8han/giter8)
 
## Installation on Mac

    brew update && brew install giter8

## Installation on linux

    curl https://raw.githubusercontent.com/n8han/conscript/master/setup.sh | sh
    cs n8han/giter8
 
## Usage
    g8 https://github.com/lachatak/scalaprojecttemplate.g8 -b multi

Provide value for:
 
- name: name describing application. It will be used for the package structure, file names in camel case format and in the project configuration

You can use --force flag to overwrite already existing files.