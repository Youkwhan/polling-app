### API Endpoints Overview

| **API**         | **Endpoint**         | **Method** | **Description**                                        | **Request Body**       | **Response**                                |
|------------------|------------------------|------------|--------------------------------------------------------|-------------------------|----------------------------------------------|
| Create Poll      | `/api/polls`           | POST       | Creates a new poll with options for voting.           | Post JSON              | `201 Created` with the created poll.         |
| Get All Polls    | `/api/polls`           | GET        | Retrieves a list of all polls.                        | None                   | `200 OK` with a list of poll objects.        |
| Get Poll by ID   | `/api/polls/{id}`      | GET        | Retrieves details of a specific poll by ID.           | None                   | `200 OK` with poll object or `404 Not Found` |
| Vote on Poll     | `/api/polls/vote`      | POST       | Submits a vote for a specific option in a poll.       | Poll ID and Option     | `204 No Content.`                            |

