# Algorithm – Career Recommendation System (FR1)

## Briefing
This algorithm recommends suitable career paths for MEC students based on their academic performance and interests. It calculates a score for each career option, filters students with low GPA, and outputs the top ranked career recommendations.

## Pseudocode

Algorithm: Career Recommendation Based on Academic Performance

Input:
- GPA
- Grades: Math, Control, Programming
- Interest

Output:
- Top 3 recommended careers

1. Define a list of career paths and their academic weights
2. Initialize an empty list for scores
3. IF GPA < 2.0 THEN
      Display a warning message
   ELSE
      FOR each career in career paths DO
          Compute score using weighted grades
          IF interest matches the career THEN
              score = score + 5
          ELSE
              score = score + 0
          ENDIF
          Store career and score
      ENDFOR
      Sort scores in descending order
      Output top 3 careers
   ENDIF
End
