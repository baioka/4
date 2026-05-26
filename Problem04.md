### Problem 4. Number of Provinces

There are `n` cities.
Some of them are connected, while some are not.
If city `a` is connected directly with city `b`, and city `b` is connected directly with city `c`, then city `a` is connected indirectly with city `c`.

A **province** is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an `n` by `n` matrix `isConnected` where `isConnected[i][j] = 1` if the `i`th city and the `j`th city are directly connected, and `isConnected[i][j] = 0` otherwise.

Return *the total number* of **provinces**.

Write your solution in [src/Problem04.java](src/Problem04.java)

#### Example 1:

<img width="222" height="142" alt="image" src="https://github.com/user-attachments/assets/8edf4b9e-c3ca-42c6-ab77-0112f3ba4d6c" />

```
Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
Output: 2
```

#### Example 2:

<img width="222" height="142" alt="image" src="https://github.com/user-attachments/assets/48321e61-0e41-4f3f-8565-0d1469146b51" />

```
Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
```

#### Constraints

+ `1 <= n <= 200`
+ `n == isConnected.length`
+ `n == isConnected[i].length`
+ `isConnected[i][j]` is `1` or `0`
+ `isConnected[i][i] == 1`
+ `isConnected[i][j] == isConnected[j][i]`
