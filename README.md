# TwitterBackEndMockitoOOPAdvanced

0. Explain design: Domain model, Service, AnalyticsEngine - design
1. Implement all the necessary classes in flat structure: Comment, Tweet, User - encapsulation
2. Extract some abstraction: Comment and Tweet are Posts/Messages (is-a), Post/Message implements PostableI/MessageableI - interfaces / abstraction
3. User with all of his tweets (calls Service class: getTweetsByUsername()) - aggregation
4. Mock the Service class to return stubs - mockito
5. Create the DAO (generic top level class and subclasses)
6. Read Tweets from CSV, Comments from Word (or other text or binary files)
