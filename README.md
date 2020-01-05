# Graph
Assigment 2
class Node implemnts node_data

Every Node has key(int), weight(double), info(String), point(Point3D) and tag(int).
there are getters and setters to the class.



class Edge implemnts edge_data

Every Node has source(node_data), destination(node_data), weight(double), info(String), and tag(int).
there are getters and setters to the class.

class DGraph implemnts graph

Every Node has hashmap of key(int) and value(node_data) and a hashmap of key(pair(two node_data)) and value(edge_data).
there are getters and setters to a specific edge or node.
connect function gets two key and a weight and connect two nodes to a edge.
add node get a node and add it to the graph.
getV return all the node of the graph.
getE gets a key and return all the edges with that key.
removeNode remov a node and all the edges that use this node.
removeEdge get a source and destination and remove the edge.
nodeSize return the amount of nodes.
edgeSize return the amount of edges.

class graph_algo implements graph_algoritm

graph_algo has a graph
it can be initiated from json file or from graph.
it can be saved to a json file.
isConnected check if all the node has a connection to each other.
shortestPath gets source and destination and find the shortest path between them.
shortestPath gets source and destination and find the shortest distans between them.
TSP get a list of nodes and return the shortest path between all of them
copy is copying the graph

There is a gui class that present the graph 
