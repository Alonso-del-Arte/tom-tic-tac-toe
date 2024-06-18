# Tic-Tac-Toe by Tom Phillips

For this project, I created a playable version of Tic-Tac-Toe on the command 
line using Java. When the program begins, the user will have the choice of 
selecting a human or computer opponent. If the user selects a computer opponent, 
the computer will block the user's moves each time, preventing them from 
winning. If the user selects a human opponent, the game will allow two users to 
alternate between placing X's or O's on the board until someone wins or there is 
a draw. 

## What I Learned

This project has been really beneficial because it is the first time I have 
experimented with implementing a simple AI in a program. Since the logic behind 
Tic-Tac-Toe only allows for a limited number of possibilities, it proved to be a 
good exercise in developing methods that would counter each of the user's moves. 
Additionally, within this program I strived to create small methods broken up 
into various classes to create clean, readable code. I found myself going back a 
number of times to refactor my code to keep any one class or method from 
becoming too bulky.

# Review by Alonso del Arte

From what I can tell, Tom started this project on Eclipse with JUnit 3.8.1. I'll 
be upgrading it at least to JUnit 4, if not JUnit 5. Also, the project, as I 
found it, seems too tied up with Eclipse, so I'm trying to separate that 
dependence so that it can be simply imported into whatever Java IDE you want to 
use.

Also, I'm moving the Git Ignore to the root level. Unlike Swift in Xcode, no 
Java IDE requires the extra folder level just below the root level that this 
project had. Though it could be that I've been putting the Git Ignore at the 
wrong level in *my* Swift projects.

The main branch was called "master," whereas the preference now is for "main." I 
see this detail more as a marker of the project's age than anything else.

I do believe the fundamentals of the project are sound and interesting, 
otherwise it would not be worthwhile to undertake this review.
