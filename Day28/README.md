# Messaging and communication
- SQS
- SNS
- Lab: Setting up SNS and SQS, Aws command line to access sqs and SNS, Spring boot application to publish and suscribe sqs.

## Create Simple sqs with cloud formation MYSQSStack

### Create simple queue and verify the stack and queue

    aws cloudformation create-stack --stack-name MySQSStack --template-body file://0-sqs-template.yml --capabilities CAPABILITY_IAM

    aws cloudformation wait stack-create-complete --stack-name MySQSStack

    aws cloudformation describe-stacks --stack-name MySQSStack
    
    aws sqs list-queues

### Delete queue and verify the stack if its deleted

    aws cloudformation delete-stack --stack-name MySQSStack

    aws cloudformation describe-stacks --stack-name MySQSStack

    aws sqs list-queues


## Create Simple SQS and DLQ backup with cloud formation MySQSDLQStack


### Create simple queue and verify the stack and queue

    aws cloudformation create-stack --stack-name MySQSDLQStack --template-body file://a-sqs-dlq-template.yml --capabilities CAPABILITY_IAM

    aws cloudformation wait stack-create-complete --stack-name MySQSDLQStack

    aws cloudformation describe-stacks --stack-name MySQSDLQStack

### SQS command

#### List Queue
    aws sqs list-queues

#### Publish or Send Message to SQS

    aws sqs send-message --queue-url <QueueURL> --message-body "This is my message"
    aws sqs send-message --queue-url https://sqs.us-east-1.amazonaws.com/201964534042/text-message-event-queue --message-body "Hello, SQS"

#### Receive Message from SQS

    aws sqs receive-message --queue-url <QueueURL>
    aws sqs receive-message --queue-url https://sqs.us-east-1.amazonaws.com/201964534042/text-message-event-queue


#### Delete Message from SQS

    aws sqs delete-message --queue-url <QueueURL> --receipt-handle <ReceiptHandle>
    aws sqs delete-message --queue-url https://sqs.us-east-1.amazonaws.com/201964534042/text-message-event-queue --receipt-handle AQEBzfb7...2fQ==

#### Get Queue Attributes

    aws sqs get-queue-attributes --queue-url <QueueURL> --attribute-names All
    aws sqs get-queue-attributes --queue-url https://sqs.us-east-1.amazonaws.com/201964534042/text-message-event-queue --attribute-names All

#### Set Queue Attributes

    aws sqs set-queue-attributes --queue-url <QueueURL> --attributes VisibilityTimeout=60
    aws sqs set-queue-attributes --queue-url https://sqs.us-east-1.amazonaws.com/201964534042/text-message-event-queue --attributes VisibilityTimeout=30

#### Delete an SQS Queue

    aws sqs delete-queue --queue-url <QueueURL>
    aws sqs delete-queue --queue-url https://sqs.us-east-1.amazonaws.com/201964534042/text-message-event-queue



### Delete queue and verify the stack if its deleted

    aws cloudformation delete-stack --stack-name MySQSDLQStack

    aws cloudformation describe-stacks --stack-name MySQSDLQStack

    aws sqs list-queues

## Create SNS Topic Using Cloud Fformation

    aws cloudformation create-stack --stack-name MySNSStack --template-body file://b-sns-template.yml --capabilities CAPABILITY_IAM

    aws cloudformation wait stack-create-complete --stack-name MySNSStack

    aws cloudformation describe-stacks --stack-name MySNSStack


### SNS commands

#### List SNS Topics
    aws sns list-topics

#### Publish a Message to an SNS Topic

    aws sns publish --topic-arn <TopicArn> --message "Your message here"
    aws sns publish --topic-arn <TopicArn> --message "Your message here" --subject "Your Subject"

#### List Subscriptions
    aws sns list-subscriptions

#### List Subscriptions by Topic
    aws sns list-subscriptions-by-topic --topic-arn <TopicArn>
    aws sns list-subscriptions-by-topic --topic-arn arn:aws:sns:us-east-1:201964534042:MyTopic

#### Get Subscription Attributes
    aws sns get-subscription-attributes --subscription-arn <SubscriptionArn>

#### Set Subscription Attributes
    aws sns set-subscription-attributes --subscription-arn <SubscriptionArn> --attribute-name <AttributeName> --attribute-value <AttributeValue>

#### Get Topic Attributes
    aws sns get-topic-attributes --topic-arn <TopicArn>
    aws sns get-topic-attributes --topic-arn arn:aws:sns:us-east-1:201964534042:MyTopic

#### Set Topic Attributes
    aws sns set-topic-attributes --topic-arn <TopicArn> --attribute-name <AttributeName> --attribute-value <AttributeValue>
    aws sns set-topic-attributes --topic-arn arn:aws:sns:us-east-1:201964534042:MyTopic --attribute-name <AttributeName> --attribute-value <AttributeValue>

#### List Tags for an SNS Topic
    aws sns list-tags-for-resource --resource-arn <TopicArn>

#### Tag an SNS Topic
    aws sns tag-resource --resource-arn <TopicArn> --tags Key=<TagKey>,Value=<TagValue>

#### Untag an SNS Topic
    aws sns untag-resource --resource-arn <TopicArn> --tag-keys <TagKey>

#### Subscribe to an SNS Topic
    aws sns subscribe --topic-arn <TopicArn> --protocol <Protocol> --notification-endpoint <Endpoint>

    <TopicArn>: ARN of the SNS topic.
    <Protocol>: Protocol to use (e.g., email, sms, sqs, http, https, lambda).
    <Endpoint>: The endpoint to receive notifications (e.g., email address, phone number, SQS ARN).

    aws sns subscribe --topic-arn arn:aws:sns:us-east-1:123456789012:MyTopic --protocol email --notification-endpoint example@example.com

#### Unsubscribe from an SNS Topic

    aws sns unsubscribe --subscription-arn <SubscriptionArn>


#### Create an SNS Topic
    aws sns create-topic --name MyTopic

#### Delete an SNS Topic
    aws sns delete-topic --topic-arn <TopicArn>

### Delete queue and verify the stack if its deleted

    aws cloudformation delete-stack --stack-name MySQSDLQStack

    aws cloudformation describe-stacks --stack-name MySQSDLQStack

    aws sqs list-queues

## Create SQS and SNS backup with cloud formation MySQSDLQStack