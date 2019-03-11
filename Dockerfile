FROM katalonstudio/katalon

ARG DATE
ARG VERSION

LABEL com.periferiaitgroup.name="Katalonpr" \
	  com.periferiaitgroup.description="proyecto katalon periferiaitgroup" \
	  com.periferiaitgroup.version=$VERSION \
	  com.periferiaitgroup.vendor="rafael polo" \ 
	  com.periferiaitgroup.fecha=$DATE
	 
	  
RUN apt-get update && \
    apt-get install --no-install-recommends -y \ 
    && apt-get clean

ENTRYPOINT [""]