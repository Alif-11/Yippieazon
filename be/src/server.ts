import express from "express";
import cors from "cors";
import dotenv from "dotenv";

import { createServer } from 'http';

const app = express();
const PORT = process.env.PORT || 3001;

const httpServer = createServer(app);

httpServer.listen(PORT, () => {
  console.log(`Running on port ${PORT}.`)
})