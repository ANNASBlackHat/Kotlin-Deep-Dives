# Kotlin Deep Dives
Deep dives into kotlin : 

[1. Types](https://github.com/ANNASBlackHat/Kotlin-Deep-Dives#types) <br/>
[2. RxJava with Kotlin](https://github.com/ANNASBlackHat/Kotlin-Deep-Dives#rxjava-with-kotlin)

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

## RxJava with Kotlin
RxJava is all about asynchronous data stream
Example : 
 - Click events
 - Reading a file
 - Database access
 - Device sensor update
 - Keyboard input
 
Reasons why people love RxJava : 
1. Chaining
2. Threading
3. Abstraction
4. Non-Blocking
5. Composable
6. Avoid callbacks
7. Data transformation

#### Observable
You can think observable as producing some sort of stream of events. It can happen either hot or a cold manner.
**Hot Observable** doing work as soon as they're created.
**Cold Observable** they don't work when susbcriber order to work.

*Where the observable come from?*
```Kotlin
Observable.create<Int> { subscriber -> }
//or
Observable.just(item1, item2, item3)
//or
Observable.interval(2, TimeUnit.SECONDS)
```
#### Observer
Observer is the abstraction that RxJava uses for listening or observing the various items or events that the observable is producing
#### Operators
Operators are what help you to transform combined and create observable
**Map** Operator : 
```Kotlin
Observable.just(1,2,3)
    .map { it * 2}  // Data transformation
    .subscribe { println(it) }
// output : 246
```

 
