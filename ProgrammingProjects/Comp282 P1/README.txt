Allen Zohrabians
COMP 282
Summer 2019


QUESTIONS FOR README.TXT 


1) The largest number of words (W) I was able to test with was around 28,700. At that value of input the program would run smoothly for parts 3, 4, and 5. However, the addition of more words would create an error after part 3 (the array) was completed and would crash at part 4 (the linked list).


2) The runtime of the Array in-place reversal for W words was about 1,520,776,074 nanoseconds which is equivalent to 1.520776074 seconds.


3) The runtime of the Linked List reversal for W words was about 7,560,925,755 nanoseconds which is equivalent to 7.560925755 seconds.


4) The runtime of the Queue/Stack reversal for W words was about 1,755,834,364 nanoseconds which is equivalent to 1.755834364 seconds.


5) The runtime of the Array in-place reversal for W/2 words was about 479,053,655 nanoseconds which is equivalent to 0.479053655 seconds.


6) The runtime of the Linked List reversal for W/2 words was about 1,729,580,172 nanoseconds which is equivalent to 1.729580172 seconds.


7) The runtime of the Queue/Stack reversal for W/2 words was about 448,206,086 nanoseconds which is equivalent to 0.448206086 seconds.


8) The runtime of the Array in-place reversal for W/4 words was about 174,197,127 nanoseconds which is equivalent to 0.174197127 seconds.


9) The runtime of the Linked List reversal for W/4 words was about 442,508,907 nanoseconds which is equivalent to 0.442508907 seconds.


10) The runtime of the Queue/Stack reversal for W/4 words was about 216,056,632 nanoseconds which is equivalent to 0.216056632 seconds.


11) Based on the answers from #1 to #10, I feel as though the Linked List reversal of Strings is the least efficient data structure for the amount of words tested (W, W/2, and W/4). The Array in-place reversal and the Queue/Stack reversal are definitely the fastest strategies to apply in the case of reversing a list of Strings. Both are very close in terms of time complexity, however the Array was slightly quicker with W by about 0.23 seconds as well as W/4 by about 0.04 seconds. In turn, the Queue/Stack was actually more efficient in the case of W/2 words by about 0.03 seconds.