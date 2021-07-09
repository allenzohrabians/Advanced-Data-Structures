Allen Zohrabians
COMP 282
Summer 2019


QUESTIONS FOR README.TXT 


1) There doesn’t seem to be anything not working within the code. Everything ran well upon review, and there were no implications of defective code or a faulty output. The results of this were very much to my liking.


2) In terms of anything in the code being incomplete, I don’t believe that is the case as I was able to include a sufficient amount of detail in both my AVLNode and AVLTree classes as well as a Main class that provides an organized layout to prompt user input for the tree through adding, removing, searching, and a quit option.


3) The following are the final results of output on 5 separate runs of the AVL Tree program with 15 different integers added into the tree one at a time.


AVL Tree #1


In Order Traversal:
2 3 7 8 11 13 15 16 19 21 24 25 26 27 28 


Print:
(AVLNode@3d4eac69, 16, AVLNode@55f96302, AVLNode@42a57993) (AVLNode@55f96302, 7, AVLNode@7d4991ad, AVLNode@28d93b30) (AVLNode@7d4991ad, 2, -1, AVLNode@677327b6) 
(AVLNode@677327b6, 3, -1, -1) 
(AVLNode@28d93b30, 13, AVLNode@1540e19d, AVLNode@6bc7c054) (AVLNode@1540e19d, 11, AVLNode@14ae5a5, -1) 
(AVLNode@14ae5a5, 8, -1, -1) (AVLNode@6bc7c054, 15, -1, -1) 
(AVLNode@42a57993, 25, AVLNode@1b6d3586, AVLNode@4554617c) (AVLNode@1b6d3586, 21, AVLNode@75b84c92, AVLNode@4aa298b7) (AVLNode@75b84c92, 19, -1, -1) (AVLNode@4aa298b7, 24, -1, -1) 
(AVLNode@4554617c, 27, AVLNode@74a14482, AVLNode@232204a1) (AVLNode@74a14482, 26, -1, -1) (AVLNode@232204a1, 28, -1, -1) 


AVL Tree #2


In Order Traversal:
2 4 7 8 9 11 14 15 18 19 21 22 24 26 30 


Print:
(AVLNode@6bc7c054, 21, AVLNode@55f96302, AVLNode@7d4991ad) (AVLNode@55f96302, 9, AVLNode@42a57993, AVLNode@74a14482) (AVLNode@42a57993, 7, AVLNode@75b84c92, AVLNode@232204a1) (AVLNode@75b84c92, 2, -1, AVLNode@677327b6) 
(AVLNode@677327b6, 4, -1, -1) (AVLNode@232204a1, 8, -1, -1) 
(AVLNode@74a14482, 14, AVLNode@3d4eac69, AVLNode@14ae5a5) 
(AVLNode@3d4eac69, 11, -1, -1) 
(AVLNode@14ae5a5, 18, AVLNode@4aa298b7, AVLNode@1540e19d) (AVLNode@4aa298b7, 15, -1, -1) (AVLNode@1540e19d, 19, -1, -1) 
(AVLNode@7d4991ad, 26, AVLNode@1b6d3586, AVLNode@28d93b30) (AVLNode@1b6d3586, 24, AVLNode@4554617c, -1) (AVLNode@4554617c, 22, -1, -1) (AVLNode@28d93b30, 30, -1, -1) 


AVL Tree #3


In Order Traversal:
1 5 6 7 10 13 15 16 20 21 24 25 26 29 30 


Print:
(AVLNode@232204a1, 21, AVLNode@42a57993, AVLNode@28d93b30) (AVLNode@42a57993, 13, AVLNode@55f96302, AVLNode@677327b6) (AVLNode@55f96302, 6, AVLNode@4554617c, AVLNode@75b84c92) (AVLNode@4554617c, 5, AVLNode@14ae5a5, -1) (AVLNode@14ae5a5, 1, -1, -1) (AVLNode@75b84c92, 7, -1, AVLNode@1540e19d) (AVLNode@1540e19d, 10, -1, -1) (AVLNode@677327b6, 16, AVLNode@3d4eac69, AVLNode@4aa298b7) (AVLNode@3d4eac69, 15, -1, -1) (AVLNode@4aa298b7, 20, -1, -1) 
(AVLNode@28d93b30, 26, AVLNode@6bc7c054, AVLNode@7d4991ad) (AVLNode@6bc7c054, 24, -1, AVLNode@1b6d3586) (AVLNode@1b6d3586, 25, -1, -1) (AVLNode@7d4991ad, 30, AVLNode@74a14482, -1) (AVLNode@74a14482, 29, -1, -1) 


AVL Tree #4


In Order Traversal:
2 4 5 8 9 10 12 17 19 21 24 26 27 28 29 


Print:
(AVLNode@3d4eac69, 21, AVLNode@4aa298b7, AVLNode@42a57993) (AVLNode@4aa298b7, 10, AVLNode@75b84c92, AVLNode@6bc7c054) (AVLNode@75b84c92, 8, AVLNode@1540e19d, AVLNode@1b6d3586) (AVLNode@1540e19d, 4, AVLNode@7d4991ad, AVLNode@74a14482) (AVLNode@7d4991ad, 2, -1, -1) (AVLNode@74a14482, 5, -1, -1) 
(AVLNode@1b6d3586, 9, -1, -1) 
(AVLNode@6bc7c054, 17, AVLNode@55f96302, AVLNode@14ae5a5) 
(AVLNode@55f96302, 12, -1, -1) (AVLNode@14ae5a5, 19, -1, -1) 
(AVLNode@42a57993, 26, AVLNode@28d93b30, AVLNode@677327b6) (AVLNode@28d93b30, 24, -1, -1) 
(AVLNode@677327b6, 28, AVLNode@4554617c, AVLNode@232204a1) (AVLNode@4554617c, 27, -1, -1) (AVLNode@232204a1, 29, -1, -1) 


AVL Tree #5


In Order Traversal:
1 3 6 7 9 10 11 12 13 18 19 20 21 25 27 


Print:
(AVLNode@75b84c92, 13, AVLNode@55f96302, AVLNode@6bc7c054) (AVLNode@55f96302, 9, AVLNode@4aa298b7, AVLNode@74a14482) (AVLNode@4aa298b7, 6, AVLNode@7d4991ad, AVLNode@28d93b30) (AVLNode@7d4991ad, 3, AVLNode@14ae5a5, -1) (AVLNode@14ae5a5, 1, -1, -1) (AVLNode@28d93b30, 7, -1, -1) 
(AVLNode@74a14482, 11, AVLNode@42a57993, AVLNode@232204a1) (AVLNode@42a57993, 10, -1, -1) (AVLNode@232204a1, 12, -1, -1) 
(AVLNode@6bc7c054, 20, AVLNode@1b6d3586, AVLNode@3d4eac69) (AVLNode@1b6d3586, 19, AVLNode@677327b6, -1) (AVLNode@677327b6, 18, -1, -1)
(AVLNode@3d4eac69, 25, AVLNode@1540e19d, AVLNode@4554617c) (AVLNode@1540e19d, 21, -1, -1) (AVLNode@4554617c, 27, -1, -1)