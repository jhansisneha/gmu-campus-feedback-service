# Student Survey Platform — GMU Campus Visit Feedback System

A Spring Boot microservice for collecting and processing post-visit feedback from prospective students visiting George Mason University.  
Includes CI/CD pipelines built with Jenkins and deployed on AWS EC2.


## Features
- REST API for survey submission
- Validates form fields (name, email, satisfaction rating, etc.)
- Collects feedback on campus experience and student interests
- Stores submission data in-memory (or can connect to DB)
- Accessible via public endpoint hosted on AWS EC2
- Jenkins pipeline for automated build, test, and deployment

## Tech Stack
| Category      | Tools/Technologies            |
|---------------|-------------------------------|
| Language      | Java 17                       |
| Framework     | Spring Boot                   |
| Build Tool    | Maven                         |
| DevOps        | Jenkins, GitHub, Docker       |
| Cloud Hosting | AWS EC2 (Ubuntu instance)     |
| CI/CD         | Jenkins Pipeline + GitHub Webhooks |
| Deployment    | JAR via SCP or Docker (optional) |

---
