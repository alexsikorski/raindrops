# Raindrops

A small project developed with the intention of displaying programming, testing and git practice.

## Requirements

Write a method that takes as its input a number (n) and converts it to a string, the contents of which depend on the
numbers factors

- if the number has a **factor of 3**, output '**Pling**'
- if the number has a **factor of 5**, output '**Plang**'
- if the number has a **factor of 7**, output '**Plong**'
- if the number does **not** have any of the above as a factor simply **return** the **numbers digits**

## Approach

**TDD** (test driven development) had been used by creating the tests first. This ensures behaviour of to-be-written
method(s) are/is consistent.

Initially, it was decided to create a table of inputs/outputs as to aid with coverage.

|Input |Factors |Output |
--- | --- | ---
|3|1, 3|'Pling'|
|5|1, 5|'Plang'|
|7|1, 7|'Plong'|
|15|1, 3, 5, 15|'PlingPlang'|
|21|1, 3 ,7|'PlingPlong'
|35|1, 5, 7|'PlangPlong|
|105|1, 3, 5, 7, 15, 21, 35, 105|'PlingPlangPlong|
|34|1, 2, 17, 34 |'34'|
|0|None|'0'|
|-11|1, 11|'-11'|
|-3|1, 3|'Pling'|
|-24|1, 2, 3, 4, 6, 8, 12, 24|'Plang'|
|-14|1, 2, 7|'Plong'|
|-30|1, 2, 3, 5, 6, 10, 15, 30|'PlingPlang'|
|-42|1, 2, 3, 6, 7, 14, 21, 42|'PlingPlong'|
|-70|1, 2, 5, 7, 14, 10, 35, 70|'PlangPlong'|
|-210|1, 2, 3, 5, 6, 7, 10, 14, 15, 21, 30, 35, 42, 70, 105, 210|'PlingPlangPlong'|

Depending on the implementation, it was noted that the output order would be determined by the sequential order
of ```if``` statements. The requirements dictate that the ```'Pling'``` concatenation should be executed
before ```'Plang'```. Knowing this, the decision to check using **modulo** could follow this order:

``` 
pseudo: if (input modulo 3 is 0) append 'Pling'
        if (input modulo 5 is 0) append 'Plang'
        if (input modulo 7 is 0) append 'Plong'
```

No concrete conclusion can be derived from the requirements about the ```'Plong'``` concatenation order but one can assume the order is relative to the three factors in ascending order.

###### Authored by Alex Sikorski
