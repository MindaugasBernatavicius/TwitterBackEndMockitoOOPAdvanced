# TwitterBackEndMockitoOOPAdvanced

0. Explain design: Domain model, Dao (service), AnalyticsEngine - design
1. Implement all the necessary classes in flat structure: Comment, Tweet, Tag, User, Gender (enum) - encapsulation
2. Extract some abstraction: Comments and Tweets and PMs are Posts/Messages (is-a), Post/Message implements PostableI/MessageableI - interfaces / abstraction
3. User with all of his tweets (calls Service class: getTweetsByUsername()) - aggregation
4. Mock the Service class to return stubs - mockito
5. Create the DAO (generic top level class and subclasses)
6. Read Tweets from CSV, Comments from Word (or other text or binary files)
