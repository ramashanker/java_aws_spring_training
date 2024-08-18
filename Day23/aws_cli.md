# SetUP Aws Cli

## Login to Aws Account
    set up login to aws account using MFA with device option

## Create User Groups under IAM
    Provide the User froup name
    Attach the permission policies Adminitrator Access

## Create User under IAM
    Provide the User name 
    optional to provide access to the AWS Management Console
    Set permission to add user to user group by selecting the user groups

##  Create Security Credential for the user
    select the user under IAM
    Go to Security credentials
    Click Create access key 
    Select Command Line Interface(CLI)
    Download and save the access key locally.
    Dont put the access to any repository it use only for local

## Configure the AWS CLI with the Access Key
    Now that you have the access key, you can configure the AWS CLI with it. Open Terminal on and run:
    
    aws configure
    
    You'll be prompted to enter the following:

    AWS Access Key ID: Enter the access key ID you just created.
    AWS Secret Access Key: Enter the secret access key.
    Default region name: Enter your preferred AWS region (e.g., us-east-1).
    Default output format: You can choose json, text, or table.


## Test Your Configuration
    aws s3 ls
    Should list down the all s3 buckets

