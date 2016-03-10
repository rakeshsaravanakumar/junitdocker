FROM java 
RUN apt-get update && apt-get install -y ant
RUN mkdir /src
CMD ["ant"]
ADD . /src
WORKDIR /src
RUN ant
