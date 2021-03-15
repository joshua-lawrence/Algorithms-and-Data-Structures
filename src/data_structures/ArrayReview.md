##Arrays/Big-O Review/Reference 
(kind of basic, just writing it down for the sake of consistency)

####Properties of arrays
- Can contain multiple instances of a type.
- Numeric indexing.
- Can be statically, or dynamically sized. 
- Array size is fixed once created.

```
Reading[] readings = new Reading[5];
readings[0] = Gauge.Read();
readings[1] = Gauge.Read();
readings[2] = Gauge.Read();
```

####Analysis of Algorithms
#####Resources
- Operations - number of times we need to perform an operation
- Memory - memory consumed by algorithms
- Others - network transfer, compression ratio, disk usage


#####Big O notation
O(n):
Classifiying the cost of an algorithm in relation to n, asymptotic analysis.

O(n + 1) and O(2n) are the same as n.

- O(1): fixed cost, for example adding two integers. Fixed does not mean fast.
- O(log n): logarithmic cost, faster than linear, divides a large problem into smaller and smaller chunks. Divide and conquer.
- O(n): linear cost
- O(nm): two variables
- O(n<sup>2</sup>): exponential time, a doubly nested loop





