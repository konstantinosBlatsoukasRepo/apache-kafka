# Apache kafa

## What kafka is

 Is a distributed streaming platform:
 
 1. publish-subscribe streams of records (like queue).
 2. Store streams of records in a fault-tolerant durable way.
 3. process stream of records as they occur.
 
## Basic notions in kafka world
 
 - kafka runs in a cluster of one or more servers
 - stores streams of records in categories: _**topics**_
 - Each topic is composed by one or more **_partitions_**  
 - each record is composed of a **_key_**, a **_value_** and a **_timestamp_**
 
### Topic example

  For example, a topic can have three partitions each partition maintains (holds) records
  in temporal order:
    
  partition 0: 0 -> 1 -> 2 -> 3 -> 4 -> 5
  
  partition 1: 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6
  
  partition 2: 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
  
  In the above case the oldest record is the 0 and the most recent is the 7
  0, 1, 2, 3... are like indexes, which in the kafka world are called **_offset_**

##  Basic kafka roles 
  
  1. Producer (produces streams of records (data) in a topic)
  2. Consumer (consumes streams of records (data) from a topic)
  3. Streamer
  4. Connector

## Distribution 

  Partitions are distributed over the kafka cluster (several servers).
  More specifically, each partition has one server that is called _**"leader"**_ and 
  zero or more servers that called **_"followers"_**.
  Followers are replicating the leader silently, in case that a leader fails then
  one of the followers becomes the new leader 
  

 
  
  

  