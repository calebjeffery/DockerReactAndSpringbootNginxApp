import React, { useEffect, useState } from "react";
import "./App.css";

const App = () => {
  const [text, setText] = useState([]);
  const [barcode, setBarcode] = useState([]);

  useEffect(() => {
    // Fetch text from backend
    fetch("http://localhost:8080/api/helloworld")
      .then((response) => response.text())
      .then((data) => setText(data))
      .catch((error) => console.log(error));

    // Fetch barcode image from backend
    fetch("http://localhost:8080/api/barcode")
      .then((response) => response.blob())
      .then((data) => {
        const barcodeURL = URL.createObjectURL(data);
        setBarcode(barcodeURL);
      })
      .catch((error) => console.log(error));
  }, []);

  return (
    <div className="App">
      <h1>This is the text coming from the Spring Boot application:</h1>
      <div className="data">
        <b>{text}</b>
      </div>

      <h2>Barcode Image:</h2>
      {barcode && <img src={barcode} alt="Barcode" />}
    </div>
  );
};

export default App;
