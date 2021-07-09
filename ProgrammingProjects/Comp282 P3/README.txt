Allen Zohrabians
COMP 282
Summer 2019
Project 3

QUESTIONS FOR README.TXT 


1) After overcoming several syntax and logical errors within the code, I can comfortably claim that there aren't any defects that caused the program to malfunction and not work. I feel as though I had a very unique approach for user input with there being five separate text files to choose from: input1.txt, input2.txt, input3.txt, input4.txt, and input5.txt. Amongst them are 5 diverse sets of edges and nodes that are able to produce what we are looking for in the project.


2) In regards to the code, there was nothing that came off to me as incomplete. All the required code is present to get the intended results, however I unfortunately did not make use of java.util.set as well as SQL. With that being said, the program is running much to my liking with satisfactory outputs for the Graph, Depth First Search, Breadth First Search, and the Minimum Spanning Tree.


3) The following are five separate runs of the program, one for each of the input text files.


Output 1:
    
	Project 3 - Graphs

	Please type in the name of one of the five input.txt files: input1.txt

	Graph:
	(1) = {2:200, 3:300, 6:600}
	(2) = {1:200, 3:350, 5:500}
	(3) = {1:300, 2:350}
	(5) = {2:500, 4:550, 6:650}
	(4) = {5:550}
	(6) = {1:600, 5:650}

	Breadth First Search:
	(1) 200 (2) 300 (3) 600 (6) 500 (5) 550 (4)

	Depth First Search:
	(1) 200 (2) 350 (3) 500 (5) 550 (4) 650 (6)

	Minimum Spanning Tree:
	(1) 200 (2) 300 (3) 500 (5) 550 (4) 600 (6)


Output 2:
    
	Project 3 - Graphs

	Please type in the name of one of the five input.txt files: input2.txt

	Graph:
	(0) = {1:4, 7:8}
	(1) = {0:4, 2:8, 7:11}
	(7) = {6:1, 8:7, 0:8, 1:11}
	(2) = {8:2, 5:4, 3:7, 1:8}
	(6) = {7:1, 5:2, 8:6}
	(8) = {2:2, 6:6, 7:7}
	(3) = {2:7, 4:9, 5:14}
	(5) = {6:2, 2:4, 4:10, 3:14}
	(4) = {3:9, 5:10}

	Breadth First Search:
	(0) 4 (1) 8 (7) 8 (2) 1 (6) 7 (8) 4 (5) 7 (3) 10 (4)

	Depth First Search:
	(0) 4 (1) 8 (2) 2 (8) 6 (6) 1 (7) 2 (5) 10 (4) 9 (3)

	Minimum Spanning Tree:
	(0) 4 (1) 8 (7) 1 (6) 2 (5) 4 (2) 2 (8) 7 (3) 9 (4)


Output 3:
    
	Project 3 - Graphs

	Please type in the name of one of the five input.txt files: input3.txt

	Graph:
	(1) = {2:100}
	(2) = {1:100, 3:200}
	(3) = {2:200, 4:300}
	(4) = {3:300}

	Breadth First Search:
	(1) 100 (2) 200 (3) 300 (4)

	Depth First Search:
	(1) 100 (2) 200 (3) 300 (4)

	Minimum Spanning Tree:
	(1) 100 (2) 200 (3) 300 (4)


Output 4:

	Project 3 - Graphs

	Please type in the name of one of the five input.txt files: input4.txt

	Graph:
	(1) = {2:200, 3:300, 4:400, 5:500, 6:600}
	(2) = {1:200}
	(3) = {1:300}
	(4) = {1:400}
	(5) = {1:500}
	(6) = {1:600}

	Breadth First Search:
	(1) 200 (2) 300 (3) 400 (4) 500 (5) 600 (6)

	Depth First Search:
	(1) 200 (2) 300 (3) 400 (4) 500 (5) 600 (6)

	Minimum Spanning Tree:
	(1) 200 (2) 300 (3) 400 (4) 500 (5) 600 (6)

Output 5:
   	
	Project 3 - Graphs

	Please type in the name of one of the five input.txt files: input5.txt

	Graph:
	(1) = {2:100, 3:200}
	(2) = {1:100, 3:300}
	(3) = {1:200, 2:300}

	Breadth First Search:
	(1) 100 (2) 200 (3)

	Depth First Search:
	(1) 100 (2) 300 (3)

	Minimum Spanning Tree:
	(1) 100 (2) 200 (3)
