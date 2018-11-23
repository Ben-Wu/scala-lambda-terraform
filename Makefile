build:
	sbt assembly

deploy:
	$(MAKE) -C terraform apply

clean:
	rm -r target/
