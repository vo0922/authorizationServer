echo "Deploy Project...."

nohup java -jar /home/ubuntu/build/demo-0.0.1-SNAPSHOT.jar > /home/ubuntu/build/demo.log 2>&1 &

echo "Done"