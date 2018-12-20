/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayla
 */
public class TestShortestPath {
    
    public static void main(String[] args)
    {
            
            EdgeWeightedDigraph g = new EdgeWeightedDigraph(51);
        
            g.addEdge(new DirectedEdge(0, 1, 33));
            g.addEdge(new DirectedEdge(0, 2, 30));
            g.addEdge(new DirectedEdge(0, 6, 17));
            g.addEdge(new DirectedEdge(0, 9, 25));
            
            g.addEdge(new DirectedEdge(1, 0, 33));
            g.addEdge(new DirectedEdge(1, 4, 25));
            g.addEdge(new DirectedEdge(1, 5, 13));
            g.addEdge(new DirectedEdge(1, 6, 18));
            
            g.addEdge(new DirectedEdge(2, 0, 30));
            g.addEdge(new DirectedEdge(2, 3, 15));
            g.addEdge(new DirectedEdge(2, 9, 20));
            g.addEdge(new DirectedEdge(2, 10, 35));
            g.addEdge(new DirectedEdge(2, 12, 27));

            g.addEdge(new DirectedEdge(3, 2, 15));
            g.addEdge(new DirectedEdge(3, 8, 15));
            g.addEdge(new DirectedEdge(3, 9, 31));
            g.addEdge(new DirectedEdge(3, 12, 23));
            g.addEdge(new DirectedEdge(3, 14, 15));
            g.addEdge(new DirectedEdge(3, 21, 20));
            
            g.addEdge(new DirectedEdge(4, 1, 25));
            g.addEdge(new DirectedEdge(4, 5, 20));
            g.addEdge(new DirectedEdge(4, 7, 31));
            g.addEdge(new DirectedEdge(4, 16, 40));
            
            g.addEdge(new DirectedEdge(5, 1, 13));
            g.addEdge(new DirectedEdge(5, 4, 20));
            g.addEdge(new DirectedEdge(5, 6, 20));
            g.addEdge(new DirectedEdge(5, 8, 30));
            g.addEdge(new DirectedEdge(5, 7, 15));

            g.addEdge(new DirectedEdge(6, 0, 17));
            g.addEdge(new DirectedEdge(6, 1, 18));
            g.addEdge(new DirectedEdge(6, 5, 20));            
            g.addEdge(new DirectedEdge(6, 8, 25));
            g.addEdge(new DirectedEdge(6, 9, 21));
            
            g.addEdge(new DirectedEdge(7, 4, 31));
            g.addEdge(new DirectedEdge(7, 5, 15));
            g.addEdge(new DirectedEdge(7, 8, 35));
            g.addEdge(new DirectedEdge(7, 16, 25));
            g.addEdge(new DirectedEdge(7, 17, 20));
            g.addEdge(new DirectedEdge(7, 32, 30));
            
            g.addEdge(new DirectedEdge(8, 3, 15));
            g.addEdge(new DirectedEdge(8, 5, 30));
            g.addEdge(new DirectedEdge(8, 6, 25));
            g.addEdge(new DirectedEdge(8, 7, 35));
            g.addEdge(new DirectedEdge(8, 9, 16));
            g.addEdge(new DirectedEdge(8, 32, 32));
            g.addEdge(new DirectedEdge(8, 21, 35));
            
            g.addEdge(new DirectedEdge(10, 2, 35));
            g.addEdge(new DirectedEdge(10, 12, 22));
            g.addEdge(new DirectedEdge(10, 13, 28));
            
            g.addEdge(new DirectedEdge(11, 47, 33));
            g.addEdge(new DirectedEdge(11, 43, 35));
            g.addEdge(new DirectedEdge(11, 45, 21));
            g.addEdge(new DirectedEdge(11, 48, 44));
            
            g.addEdge(new DirectedEdge(12, 2, 27));
            g.addEdge(new DirectedEdge(12, 3, 23));
            g.addEdge(new DirectedEdge(12, 10, 22));
            g.addEdge(new DirectedEdge(12, 14, 22));
            g.addEdge(new DirectedEdge(12, 15, 30));
            
            g.addEdge(new DirectedEdge(13, 10, 28));
            g.addEdge(new DirectedEdge(13, 15, 28));
            g.addEdge(new DirectedEdge(13, 20, 40));
            
            g.addEdge(new DirectedEdge(14, 3, 15));
            g.addEdge(new DirectedEdge(14, 12, 22));
            g.addEdge(new DirectedEdge(14, 15, 36));
            g.addEdge(new DirectedEdge(14, 19, 23));
            g.addEdge(new DirectedEdge(14, 20, 35));
            g.addEdge(new DirectedEdge(14, 21, 16));
            
            g.addEdge(new DirectedEdge(15, 12, 30));
            g.addEdge(new DirectedEdge(15, 13, 28));
            g.addEdge(new DirectedEdge(15, 14, 36));
            g.addEdge(new DirectedEdge(15, 20, 25));
            
            g.addEdge(new DirectedEdge(16, 4, 40));
            g.addEdge(new DirectedEdge(16, 17, 30));
            g.addEdge(new DirectedEdge(16, 22, 35));
            g.addEdge(new DirectedEdge(16, 27, 50));
            
            g.addEdge(new DirectedEdge(17, 7, 20));
            g.addEdge(new DirectedEdge(17, 16, 30));
            g.addEdge(new DirectedEdge(17, 22, 28));
            g.addEdge(new DirectedEdge(17, 23, 25));
            g.addEdge(new DirectedEdge(17, 28, 38));
            g.addEdge(new DirectedEdge(17, 32, 15));
            
            g.addEdge(new DirectedEdge(18, 21, 20));
            g.addEdge(new DirectedEdge(18, 32, 15));
            g.addEdge(new DirectedEdge(18, 23, 30));
            g.addEdge(new DirectedEdge(18, 29, 40));
            g.addEdge(new DirectedEdge(18, 24, 30));
            
            g.addEdge(new DirectedEdge(19, 14, 23));
            g.addEdge(new DirectedEdge(19, 20, 30));
            g.addEdge(new DirectedEdge(19, 21, 30));
            g.addEdge(new DirectedEdge(19, 24, 35));
            g.addEdge(new DirectedEdge(19, 25, 25));
            g.addEdge(new DirectedEdge(19, 26, 40));
            
            g.addEdge(new DirectedEdge(20, 13, 40));
            g.addEdge(new DirectedEdge(20, 14, 35));
            g.addEdge(new DirectedEdge(20, 15, 25));
            g.addEdge(new DirectedEdge(20, 19, 30));
            g.addEdge(new DirectedEdge(20, 26, 30));
            
            g.addEdge(new DirectedEdge(21, 3, 20));
            g.addEdge(new DirectedEdge(21, 8, 35));
            g.addEdge(new DirectedEdge(21, 14, 16));
            g.addEdge(new DirectedEdge(21, 18, 20));
            g.addEdge(new DirectedEdge(21, 19, 30));
            g.addEdge(new DirectedEdge(21, 24, 45));
            g.addEdge(new DirectedEdge(21, 32, 26));
            
            g.addEdge(new DirectedEdge(22, 16, 35));
            g.addEdge(new DirectedEdge(22, 17, 28));
            g.addEdge(new DirectedEdge(22, 27, 35));
            g.addEdge(new DirectedEdge(22, 28, 30));
            
            g.addEdge(new DirectedEdge(23, 17, 25));
            g.addEdge(new DirectedEdge(23, 18, 30));
            g.addEdge(new DirectedEdge(23, 28, 18));
            g.addEdge(new DirectedEdge(23, 29, 32));
            g.addEdge(new DirectedEdge(23, 32, 30));
            
            g.addEdge(new DirectedEdge(24, 18, 30));
            g.addEdge(new DirectedEdge(24, 19, 35));
            g.addEdge(new DirectedEdge(24, 21, 45));
            g.addEdge(new DirectedEdge(24, 25, 25));
            g.addEdge(new DirectedEdge(24, 29, 15));
            
            g.addEdge(new DirectedEdge(25, 19, 25));
            g.addEdge(new DirectedEdge(25, 26, 30));
            g.addEdge(new DirectedEdge(25, 30, 30));
            g.addEdge(new DirectedEdge(25, 31, 21));
            g.addEdge(new DirectedEdge(25, 37, 50));
            
            g.addEdge(new DirectedEdge(26, 19, 40));
            g.addEdge(new DirectedEdge(26, 20, 30));
            g.addEdge(new DirectedEdge(26, 31, 20));
            g.addEdge(new DirectedEdge(26, 38, 55));
            
            g.addEdge(new DirectedEdge(27, 16, 50));
            g.addEdge(new DirectedEdge(27, 22, 35));
            g.addEdge(new DirectedEdge(27, 28, 43));
            g.addEdge(new DirectedEdge(27, 34, 25));
            g.addEdge(new DirectedEdge(27, 42, 26));
            
            g.addEdge(new DirectedEdge(28, 17, 38));
            g.addEdge(new DirectedEdge(28, 22, 30));
            g.addEdge(new DirectedEdge(28, 23, 18));
            g.addEdge(new DirectedEdge(28, 27, 43));
            g.addEdge(new DirectedEdge(28, 29, 42));
            g.addEdge(new DirectedEdge(28, 34, 30));
            g.addEdge(new DirectedEdge(28, 35, 25));
            
            g.addEdge(new DirectedEdge(29, 18, 40));
            g.addEdge(new DirectedEdge(29, 23, 32));
            g.addEdge(new DirectedEdge(29, 24, 15));
            g.addEdge(new DirectedEdge(29, 28, 42));
            g.addEdge(new DirectedEdge(29, 30, 35));
            g.addEdge(new DirectedEdge(29, 35, 30));
            g.addEdge(new DirectedEdge(29, 36, 37));
            
            g.addEdge(new DirectedEdge(30, 25, 30));
            g.addEdge(new DirectedEdge(30, 29, 35));
            g.addEdge(new DirectedEdge(30, 36, 33));
            g.addEdge(new DirectedEdge(30, 37, 30));
            
            g.addEdge(new DirectedEdge(31, 25, 21));
            g.addEdge(new DirectedEdge(31, 26, 20));
            g.addEdge(new DirectedEdge(31, 37, 35));
            g.addEdge(new DirectedEdge(31, 38, 40));
            
            g.addEdge(new DirectedEdge(32, 7, 30));
            g.addEdge(new DirectedEdge(32, 8, 32));
            g.addEdge(new DirectedEdge(32, 17, 15));
            g.addEdge(new DirectedEdge(32, 18, 15));
            g.addEdge(new DirectedEdge(32, 23, 30));
            
            g.addEdge(new DirectedEdge(33, 37, 35));
            g.addEdge(new DirectedEdge(33, 38, 25));
            g.addEdge(new DirectedEdge(33, 39, 25));
            g.addEdge(new DirectedEdge(33, 46, 30));
            g.addEdge(new DirectedEdge(33, 49, 20));
            
            g.addEdge(new DirectedEdge(34, 27, 25));
            g.addEdge(new DirectedEdge(34, 28, 30));
            g.addEdge(new DirectedEdge(34, 35, 33));
            g.addEdge(new DirectedEdge(34, 41, 25));
            g.addEdge(new DirectedEdge(34, 42, 20));
            g.addEdge(new DirectedEdge(34, 43, 37));
            
            g.addEdge(new DirectedEdge(35, 28, 25));
            g.addEdge(new DirectedEdge(35, 29, 30));
            g.addEdge(new DirectedEdge(35, 34, 33));
            g.addEdge(new DirectedEdge(35, 36, 43));
            g.addEdge(new DirectedEdge(35, 41, 35));
            g.addEdge(new DirectedEdge(35, 40, 30));
            
            
            g.addEdge(new DirectedEdge(36, 29, 37));
            g.addEdge(new DirectedEdge(36, 30, 33));
            g.addEdge(new DirectedEdge(36, 35, 43));
            g.addEdge(new DirectedEdge(36, 37, 28));
            g.addEdge(new DirectedEdge(36, 39, 25));
            g.addEdge(new DirectedEdge(36, 40, 30));
            
            g.addEdge(new DirectedEdge(37, 25, 50));
            g.addEdge(new DirectedEdge(37, 30, 30));
            g.addEdge(new DirectedEdge(37, 31, 35));
            g.addEdge(new DirectedEdge(37, 33, 35));
            g.addEdge(new DirectedEdge(37, 36, 28));
            g.addEdge(new DirectedEdge(37, 38, 25));
            g.addEdge(new DirectedEdge(37, 39, 30));
            
            g.addEdge(new DirectedEdge(38, 31, 40));
            g.addEdge(new DirectedEdge(38, 33, 25));
            g.addEdge(new DirectedEdge(38, 37, 25));
            g.addEdge(new DirectedEdge(38, 49, 45));
            
            g.addEdge(new DirectedEdge(39, 33, 25));
            g.addEdge(new DirectedEdge(39, 36, 25));
            g.addEdge(new DirectedEdge(39, 37, 30));
            g.addEdge(new DirectedEdge(39, 40, 40));
            g.addEdge(new DirectedEdge(39, 46, 20));
            
            g.addEdge(new DirectedEdge(40, 35, 30));
            g.addEdge(new DirectedEdge(40, 39, 30));
            g.addEdge(new DirectedEdge(40, 39, 40));
            g.addEdge(new DirectedEdge(40, 41, 27));
            g.addEdge(new DirectedEdge(40, 45, 20));
            g.addEdge(new DirectedEdge(40, 46, 28));
            
            g.addEdge(new DirectedEdge(41, 34, 25));
            g.addEdge(new DirectedEdge(41, 35, 35));
            g.addEdge(new DirectedEdge(41, 40, 27));
            g.addEdge(new DirectedEdge(41, 43, 14));
            g.addEdge(new DirectedEdge(41, 45, 23));
            
            g.addEdge(new DirectedEdge(42, 27, 26));
            g.addEdge(new DirectedEdge(42, 34, 20));
            g.addEdge(new DirectedEdge(42, 43, 34));
            g.addEdge(new DirectedEdge(42, 44, 24));
            g.addEdge(new DirectedEdge(42, 47, 36));
            
            g.addEdge(new DirectedEdge(43, 11, 35));
            g.addEdge(new DirectedEdge(43, 34, 37));
            g.addEdge(new DirectedEdge(43, 41, 14));
            g.addEdge(new DirectedEdge(43, 42, 34));
            g.addEdge(new DirectedEdge(43, 45, 30));
            g.addEdge(new DirectedEdge(43, 47, 15));
            
            g.addEdge(new DirectedEdge(44, 42, 24));
            g.addEdge(new DirectedEdge(44, 47, 26));
            
            g.addEdge(new DirectedEdge(45, 11, 21));
            g.addEdge(new DirectedEdge(45, 40, 20));
            g.addEdge(new DirectedEdge(45, 41, 23));
            g.addEdge(new DirectedEdge(45, 43, 30));
            g.addEdge(new DirectedEdge(45, 46, 30));           
            g.addEdge(new DirectedEdge(45, 48, 33));
            
            g.addEdge(new DirectedEdge(46, 33, 30));
            g.addEdge(new DirectedEdge(46, 39, 20));
            g.addEdge(new DirectedEdge(46, 40, 28));
            g.addEdge(new DirectedEdge(46, 45, 30));
            g.addEdge(new DirectedEdge(46, 48, 15));
            g.addEdge(new DirectedEdge(46, 49, 35));
            
            g.addEdge(new DirectedEdge(47, 11, 33));
            g.addEdge(new DirectedEdge(47, 42, 36));
            g.addEdge(new DirectedEdge(47, 43, 15));
            g.addEdge(new DirectedEdge(47, 44, 26));
            
            g.addEdge(new DirectedEdge(48, 44, 44));
            g.addEdge(new DirectedEdge(48, 45, 33));
            g.addEdge(new DirectedEdge(48, 46, 15));
            g.addEdge(new DirectedEdge(48, 49, 32));
            
            g.addEdge(new DirectedEdge(49, 33, 20));
            g.addEdge(new DirectedEdge(49, 38, 45));
            g.addEdge(new DirectedEdge(49, 46, 35));
            g.addEdge(new DirectedEdge(49, 48, 32));

            g.addEdge(new DirectedEdge(50, 7, 0));
            g.addEdge(new DirectedEdge(50, 14, 0));
            g.addEdge(new DirectedEdge(50, 25, 0));
            g.addEdge(new DirectedEdge(50, 28, 0));
            g.addEdge(new DirectedEdge(50, 40, 0));

        FindShortestPath a = new FindShortestPath(g, 50);
        
        System.out.println("Shortest Path Edges: ");
        
        int path = 0;
        for(int i = 0; i < (a.edgeTo).length - 1; i++)
        {
            
            path += a.distTo[i];
            System.out.println("Customer: " + i + " Distance: " + a.distTo[i] + " Path: " + (a.edgeTo[i]).from() + " -> " + (a.edgeTo[i]).to());

        } 

        
        System.out.println("Total Cost for Shortest Path: " + path);
    }
    
}

/* OUTPUT

Shortest Path Edges: 
Customer: 0 Distance: 52.0 Path: 6 -> 0
Customer: 1 Distance: 28.0 Path: 5 -> 1
Customer: 2 Distance: 30.0 Path: 3 -> 2
Customer: 3 Distance: 15.0 Path: 14 -> 3
Customer: 4 Distance: 31.0 Path: 7 -> 4
Customer: 5 Distance: 15.0 Path: 7 -> 5
Customer: 6 Distance: 35.0 Path: 5 -> 6
Customer: 7 Distance: 0.0 Path: 50 -> 7
Customer: 8 Distance: 30.0 Path: 3 -> 8
Customer: 9 Distance: 46.0 Path: 3 -> 9
Customer: 10 Distance: 44.0 Path: 12 -> 10
Customer: 11 Distance: 41.0 Path: 45 -> 11
Customer: 12 Distance: 22.0 Path: 14 -> 12
Customer: 13 Distance: 64.0 Path: 15 -> 13
Customer: 14 Distance: 0.0 Path: 50 -> 14
Customer: 15 Distance: 36.0 Path: 14 -> 15
Customer: 16 Distance: 25.0 Path: 7 -> 16
Customer: 17 Distance: 20.0 Path: 7 -> 17
Customer: 18 Distance: 36.0 Path: 21 -> 18
Customer: 19 Distance: 23.0 Path: 14 -> 19
Customer: 20 Distance: 35.0 Path: 14 -> 20
Customer: 21 Distance: 16.0 Path: 14 -> 21
Customer: 22 Distance: 30.0 Path: 28 -> 22
Customer: 23 Distance: 18.0 Path: 28 -> 23
Customer: 24 Distance: 57.0 Path: 29 -> 24
Customer: 25 Distance: 0.0 Path: 50 -> 25
Customer: 26 Distance: 30.0 Path: 25 -> 26
Customer: 27 Distance: 43.0 Path: 28 -> 27
Customer: 28 Distance: 0.0 Path: 50 -> 28
Customer: 29 Distance: 42.0 Path: 28 -> 29
Customer: 30 Distance: 30.0 Path: 25 -> 30
Customer: 31 Distance: 21.0 Path: 25 -> 31
Customer: 32 Distance: 30.0 Path: 7 -> 32
Customer: 33 Distance: 55.0 Path: 39 -> 33
Customer: 34 Distance: 30.0 Path: 28 -> 34
Customer: 35 Distance: 25.0 Path: 28 -> 35
Customer: 36 Distance: 55.0 Path: 39 -> 36
Customer: 37 Distance: 50.0 Path: 25 -> 37
Customer: 38 Distance: 61.0 Path: 31 -> 38
Customer: 39 Distance: 30.0 Path: 40 -> 39
Customer: 40 Distance: 0.0 Path: 50 -> 40
Customer: 41 Distance: 27.0 Path: 40 -> 41
Customer: 42 Distance: 50.0 Path: 34 -> 42
Customer: 43 Distance: 41.0 Path: 41 -> 43
Customer: 44 Distance: 74.0 Path: 42 -> 44
Customer: 45 Distance: 20.0 Path: 40 -> 45
Customer: 46 Distance: 28.0 Path: 40 -> 46
Customer: 47 Distance: 56.0 Path: 43 -> 47
Customer: 48 Distance: 43.0 Path: 46 -> 48
Customer: 49 Distance: 63.0 Path: 46 -> 49
Total Cost for Shortest Path: 1653

*/