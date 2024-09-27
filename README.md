# jvm-boilerplate

> [!NOTE]
>
> This boilerplate is for learing and reference porposes, but open for enhancement.
> if there is/are unoptimized processes, we recommend you to enhance it. 
>
> It may put some overhead for you while implementing your real project, so you need to take care 
> whether you will use all the supported programming languages or select minimum only.
>
> Thank you.
>

Polyglot boilerplate of JVM based programming languages using dependency managements.


The boilerplate will contains and supports some JVM based programming languages which are **Java, Kotlin and Clojure** using **Apache Maven** as dependency management for now. In the future, we will add **Gradle** as other alternative for **Apache Maven**.

You can mix the implementation your project without many setup is needed using this boilerplate. 

## Recommendation

To use this boilerplate, we recommend to put the implementation of your project like these:

1. Java (_src/main/java_) and Kotlin (_src/main/kotlin_) source folder
   - General/Base model or domain application
   - Custom exception
   - Interfaces, enums and constant
   - Design pattern implementation with loosely coupled dependency to the implementation.
2. Clojure (_src/main/clojure_) source folder
   - Interface implementation
   - Proxy classes


## To Be Done in the Future

There some enhancement and additional feature will be added in the future in this boilerplate:

- [X] Add Deployment to Sonatype (Maven Repository)
- [X] Add multi-module support, refer [feature/multi-module](https://github.com/rajayudhaps/jvm-boilerplate/blob/feature/multi-module/pom.xml) branch for more detail and implementation
- [X] Add Gradle support
- [ ] Add other design pattern implementations
- [ ] Add Scala and Groovy (still on reasearch step)
