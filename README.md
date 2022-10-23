
# Tennis Kata

![Tennis](https://agilekatas.co.uk/img/katas/kata_tennis.png)

Tennis is a ball and racquet game that is scored in an interesting way. Instead of scoring the game using consecutive integers to denote number of points won by the players, it uses the scoring 0, 15, 30, 40, and A.

There are also special rules on how to score a game in tennis. A player must score at least four points in total and two more than their opponent to win. When the points are four, and the scores are equal, then the score is 'deuce' (40:40). When the points are four or more, and a player has one point more than their opponent, then the score is 'advantage' (A:40).

You can read more about  [Tennis](https://en.wikipedia.org/wiki/Tennis)  on Wikipedia, and if you're feeling inspired to give it a go, you can get  [Tennis Kits](https://amzn.to/3M5snZZ)  on Amazon.

## Feature 1 - Scoring a Game in Real Time
We want a program that can be used to score a game in real time, so we can use it for all of the tennis related endeavours we plan to undertake in the future. To begin with, we're going to need a way to update the score when a player wins a point, see what the current score is after each service, and see if their is a winner based on the current score and the rules above.

### User Stories
**Winning a Point Increases Score Correctly**
> As a library user  
I want the score to increase when a player wins a point  
So that I can display the current score correctly

Acceptance Criteria:
 - Given the score is 0:0  
When the server wins a point  
Then the score is 15:0
-   Given the score is 15:15  
When the receiver wins a point  
Then the score is 15:30
-   Given the score is 30:30  
When the server wins a point  
Then the score is 40:30
    
**Deuce and Advantage are Scored Correctly**
> As a library user  
I want deuce and advantage to be scored correctly  
So that I can display the score correctly

Acceptance Criteria:
 - Given the score is 40:40  
When the receiver wins a point  
Then the score should be 40:A
-   Given the score is A:40  
When the receiver wins a point  
Then the score should be 40:40

**Winning Points are Scored Correctly**
> As a library user  
I want the winning point to be scored correctly  
So that I can display the winner

Acceptance Criteria:
-   Given the score is 40:30  
When the server wins a point 
Then the server should win
-   Given the score is 40:A  
When the receiver wins a point  
Then the receiver should win

> Special thanks to https://agilekatas.co.uk/katas/Tennis-Kata
