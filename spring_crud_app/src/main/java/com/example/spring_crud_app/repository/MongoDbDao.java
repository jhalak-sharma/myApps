package com.example.spring_crud_app.repository;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDbDao {

	public static void main(String[] args) {

		// System.setProperty("jdk.tls.trustNameService", "true");

		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://sourabhhardeniya:Sourabh%401@cluster0.7sjud4i.mongodb.net/test?retryWrites=true&w=majority&connectTimeoutMS=30000");

		try (MongoClient mongoClient = new MongoClient(uri)) {
			MongoDatabase database = mongoClient.getDatabase("test");
			MongoCollection<Document> collection = database.getCollection("test collection");
			Document query = new Document("_id", new ObjectId("62e4347cb00638299bbc8ff7"));
			Document result = collection.find(query).iterator().next();

			System.out.println("name: " + result.getString("name"));
			System.out.println("age: " + result.getString("age"));
		}
	}
}
