# CoGenASD

**CogenASD** is a **Model-Driven Development (MDD)** application designed to automatically generate **multiplatform, collaborative graphical editors**.

Built on the powerful **Eclipse Modeling Framework (EMF)** and the **Eclipse Epsilon** platform, CogenASD allows developers to define a **Domain-Specific Language (DSL)** model and rapidly generate the corresponding **interactive web editor** based on the **GoJS** library.

## Quick Start

To begin using or developing with **CogenASD**, you must first set up the Eclipse Modeling environment and understand the core MDD workflow.

### **Prerequisites**

- **Eclipse IDE** with:
  - EMF
  - Eclipse Epsilon
  - SpacEclipse plugin
- **Java Development Kit (JDK)**

## Core Workflow

| Step | Action | Purpose |
|------|--------|----------|
| **1. Setup IDE** | Import the **CogenASD Editor Plugin**. | Registers the DSL and editor within your Eclipse environment. |
| **2. Validate Model** | When creating/editing a CogenASD model, click 'Edit'/'Validate'. | Ensures the model adheres to all defined constraints in the EVL file before generation. |
| **3. Generate Code** | Run the **EGL** transformation script. | Generates the final GoJS, HTML and CSS files into the `CoGenASD_Multitouch` directory. |
| **4. Run Application** | Deploy the contents of `CoGenASD_Multitouch` to any standard web server. | The final, interactive graphical editor is now accessible via a browser. |

## Key Technologies

CogenASD is structured around the **Eclipse Epsilon** (https://www.eclipse.org/epsilon/download/) project, which provides a cohesive family of **Model Management Languages**.

| Category | Technology | Function |
|-----------|-------------|-----------|
| **Modeling Foundation** | Eclipse EMF | Provides the core framework for defining models and their runtime. |
| **Metamodeling** | Emfatic language | Used to declaratively define the DSL Metamodel for CogenASD's models. |
| **Code Generation** | EGL (Epsilon Generation Language) | Template language used for Model-to-Text (M2T) transformations producing front-end code. |
| **Model Validation** | EVL (Epsilon Validation Language) | Ensures the structural and semantic integrity of the input model. |
| **Collaboration** | SpacEclipse plugin and ECF | Custom plugin layer enabling real-time, collaborative multi-user editing of model files. |
| **Generated Output** | GoJS, HTML, CSS | The target stack. GoJS renders highly interactive, dynamic graphical editors on the web. |

## Directory Organization

The repository follows a clear **separation of concerns**, dividing the artifacts required for an MDD toolchain:

CogenASD/<br>
├── teaw/                   # DSL and Metamodel Definition<br>
│   ├── model/teaw.emf      # The Emfatic source defining the CogenASD DSL structure<br>
│   └── model/teaw.ecore    # The generated EMF Metamodel file<br>
│<br>
├── SpacEclipse/            # Eclipse Plugin for the Collaborative Editor<br>
│   └── src/spaceclipse     # Source for the SpacEclipse/ECF integration and editor logic<br>
│<br>
├── teaw.validation/src/    # Model Validation Logic<br>
│   └── teaw.evl            # EVL scripts defining model validation rules<br>
│<br>
├── generation/             # Code Generation Templates<br>
│   ├── gojs.egl            # EGL templates for GoJS JavaScript generation<br>
│   └── html_page.egl       # EGL templates for HTML/CSS generation<br>
│<br>
├── CoGenASD_Multitouch/    # OUTPUT DIRECTORY: Generated web application code<br>
│   ├── index.html<br>
│   ├── css/<br>            # Stylesheets for different devices<br>
│   └── js                  # Contains the GoJS implementation<br>
│<br>
└── README.md<br>
