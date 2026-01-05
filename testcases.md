# Test Cases - AI Career Recommendation (FR1)

## TC-01: GPA Below Threshold (Path 1)
- **Requirement ID:** FR1
- **Preconditions:** System is running and ready to accept student data.
- **Test Data (Input):**
  - GPA = 1.8
  - Math = 90, Control = 85, Programming = 80
  - Interest = "Robotics"
- **Steps:**
  1. Enter the student inputs.
  2. Run the recommendation process.
- **Expected Result:**
  - System displays a warning: "GPA is below threshold. Recommendations are limited."
  - System does NOT proceed to career scoring loop.
- **Relevance / Coverage:**
  - Covers **Path 1** (GPA < 2.0 = Yes). Validates correct handling of low GPA condition.

---

## TC-02: GPA OK + Interest Matches (Path 2)
- **Requirement ID:** FR1
- **Preconditions:** System is running and career paths are configured.
- **Test Data (Input):**
  - GPA = 3.2
  - Math = 88, Control = 92, Programming = 75
  - Interest = "Automation"
- **Steps:**
  1. Enter the student inputs.
  2. Run the recommendation process.
- **Expected Result:**
  - System initializes careers and calculates scores.
  - Interest bonus (+5) is applied to the matching career.
  - System outputs Top 3 careers in descending order.
- **Relevance / Coverage:**
  - Covers **Path 2** (GPA < 2.0 = No, loop runs, Interest match = Yes).
