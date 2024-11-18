<h1>Spring Annotation-Based Project</h1>

<p>This project demonstrates the use of Spring Framework annotations for dependency injection and configuration.</p>

<h2>📂 Project Structure</h2>
<ul>
    <li><strong>com.entity:</strong> Contains the <code>Student</code> class, which is a Spring component.</li>
    <li><strong>com.main:</strong> Contains the main application logic and the Spring configuration file.</li>
</ul>

<h2>📦 Dependencies</h2>
<p>This project uses the following dependencies:</p>
<ul>
    <li><strong>Spring Core:</strong> <code>6.0.17</code></li>
    <li><strong>Spring Context:</strong> <code>6.0.17</code></li>
</ul>

<h2>🚀 How to Run</h2>
<ol>
    <li>Ensure you have Java (JDK 17 or later) and Maven installed.</li>
    <li>Clone the repository and navigate to the project directory:</li>
    <pre><code>git clone https://github.com/yourusername/SpringAnnotationBased.git</code></pre>
    <pre><code>cd SpringAnnotationBased</code></pre>
    <li>Use Maven to build and run the project:</li>
    <pre><code>mvn clean compile exec:java</code></pre>
    <li>Observe the output displaying the <code>Student</code> details in the console.</li>
</ol>

<h2>✨ Key Features</h2>
<ul>
    <li>Uses <code>@Component</code> for Spring Bean creation.</li>
    <li>Dependency injection with <code>@Value</code> annotation for property values.</li>
    <li>Annotation-based configuration using <code>@Configuration</code> and <code>@ComponentScan</code>.</li>
</ul>

<h2>📋 Output Example</h2>
<pre>
Student [id=1, name=harshit9]
</pre>

<h2>📝 License</h2>
<p>This project is free to use under the <a href="https://opensource.org/licenses/MIT">MIT License</a>.</p>
