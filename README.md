# Kotlin Deep Dives
Deep dives into kotlin : 

[1. Types](https://github.com/ANNASBlackHat/Kotlin-Deed-Dives/new/master?readme=1#types)

## Types
Kotlin has no primitive data type.

| Kotlin       | Java           |
| ------------ | -------------- |
| Int          | int            |
| Double       | double         |
| Boolean      | boolean        |

| Kotlin        | Java              |
| ------------  | --------------    |
| Int?          | java.lang.Integer |
| Double?       | java.lang.Double  |
| Boolean?      | java.lang.Boolean |

**Unit**    : a type that allows only one value and thus can hold no information <br/>
**Nothing** : a type that has no values

> **Any** is a type at top of hierarchy <br/>
**Nothing** is a type at bottom of hierarchy

#### How to prevent NPEs when collaborate with Java code?
1. Annotate your Java types (with @Nullable)
2. Specify type explicitly *(exp. var data: String? = ....)*

#### Collections
Kotlin doesn't re-implement collection library. Kotlin use Java standart library instead.
But kotlin has distinguish **Read only collection** and **Mutable collection**. In other hand, Java has only muteable collection.
> **Read only ≠ Immutable**

```kotlin
val mutableList = mutableListOf(1,2,3)
val list: List<Int> = mutableList
    
println(list)  // [1,2,3]

mutableList.add(4)
println(list)  // [1,2,3,4]
```
